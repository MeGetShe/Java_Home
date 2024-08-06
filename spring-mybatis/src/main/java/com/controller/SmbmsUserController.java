package com.controller;

import com.pojo.SmbmsUser;
import com.service.SmbmsUserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.annotation.Resource;

import java.util.List;

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

}

