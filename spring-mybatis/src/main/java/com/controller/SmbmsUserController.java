package com.controller;

import com.alibaba.fastjson.JSON;
import com.pojo.SmbmsUser;
import com.service.SmbmsUserService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import jakarta.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (SmbmsUser)表控制层
 *
 * @author makejava
 * @since 2024-08-06 13:43:50
 */
@Controller
@RequestMapping("/user")
public class SmbmsUserController {
    /**
     * 服务对象
     */
    @Resource
    private SmbmsUserService smbmsUserService;

    @RequestMapping("/queryAll")
    public String User(Model model){
        List<SmbmsUser> userList = smbmsUserService.queryAll();
        model.addAttribute("userList",userList);
       // int a=1/0;
        return "user_list";
    }

    @ResponseBody
    @GetMapping(value = "login",produces = "application/json;charset=utf-8")
    public String login(@RequestParam("userName") String userName, @RequestParam("password") String password){
        System.out.println("进入Controller");
        SmbmsUser smbmsUser=new SmbmsUser();
        smbmsUser.setUsername(userName);
        smbmsUser.setUserpassword(password);
        SmbmsUser login = smbmsUserService.login(smbmsUser);
        Map<String,String> map=new HashMap<>();
        System.out.println(login);
        if (null==login){
            map.put("code","0000");
            System.out.println(map.get("code"));
            return JSON.toJSONString(map);
        }
        map.put("code","1111");
        map.put("phone",smbmsUser.getPhone());
        System.out.println(map.get("code"));
        return JSON.toJSONString(map);
    }

}

