package com.jarod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {

    //打中文乱码
    @RequestMapping("/e/t1")
    public String test1(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
