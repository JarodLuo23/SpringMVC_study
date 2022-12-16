package com.jarod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
//    @RequestMapping("/m1/t1")
//    public String  test(HttpServletRequest req, HttpServletResponse resp){
//        HttpSession session= req.getSession();
//        System.out.println(session.getId());
//        return "test";
//    }
    @RequestMapping("/m1/t1")
    public String  test(Model model){
        model.addAttribute("msg","ModelTest1");
        return "test";
    }
    @RequestMapping("/rsm2/t2")
    public String test2(){
        //重定向
        return "redirect:/index.jsp";
        //return "redirect:hello.do"; //hello.do为另一个请求/
    }

}
