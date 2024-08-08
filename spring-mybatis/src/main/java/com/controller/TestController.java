package com.controller;

import com.alibaba.fastjson.JSON;
import com.pojo.SmbmsUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @GetMapping(value = "/getJson",produces ={"application/json;charset=utf-8"})
    public String getJson(){
        SmbmsUser smbmsUser=new SmbmsUser();
        smbmsUser.setId(1L);
        smbmsUser.setUsername("xiaoke");
        String jsonString = JSON.toJSONString(smbmsUser);
        return jsonString;
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
}
