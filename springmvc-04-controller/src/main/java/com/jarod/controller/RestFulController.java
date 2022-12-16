package com.jarod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //映射访问路径,必须是POST请求
    @RequestMapping(value = "/hello",method = {RequestMethod.POST})
    public String index2(Model model){
        model.addAttribute("msg", "hello!");
        return "test";
    }

    //映射访问路径
    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "Result is :" + res);
        //返回视图位置
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "Result is :" + res);
        return "test";
    }
}