package com.controller;

import com.pojo.Attence;
import com.service.AttenceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import jakarta.annotation.Resource;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (Attence)表控制层
 *
 * @author makejava
 * @since 2024-08-07 14:30:18
 */
@Controller
@RequestMapping("/emp")
public class AttenceController {
    /**
     * 服务对象
     */
    @Resource
    private AttenceService attenceService;


    @GetMapping("/attence")
    public ModelAndView attence(){
        List<Attence> attenceList = attenceService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("attence");
        modelAndView.addObject("attenceList", attenceList);
        return modelAndView;
    }


    @PostMapping("/add")
    public ModelAndView addAttence(@RequestParam("empName") String empName,
                                   @RequestParam("dept") String dept,
                                   @RequestParam("chkDate") String chkDate,
                                   @RequestParam("status") String status) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        Attence attence = new Attence();
        attence.setEmpName(empName);
        attence.setDept(dept);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = sdf.parse(chkDate);
        attence.setChkDate(date);
        attence.setStatus(status);
        Integer count = attenceService.insertById(attence);
        System.out.println(count);
        modelAndView.setViewName("redirect:/emp/attence");
        return modelAndView;
    }

    @GetMapping("/addAttence")
    public ModelAndView addAttence(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addAttence");
        return modelAndView;
    }



}

