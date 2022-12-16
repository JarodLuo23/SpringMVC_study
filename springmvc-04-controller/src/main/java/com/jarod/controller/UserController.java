package com.jarod.controller;

import com.jarod.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    //http://localhost:8083/user/t1?name=jarod
    //http://localhost:8083/user/t1?username=jarod
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        System.out.println("接收到前端到参数："+name);
        model.addAttribute("msg",name);
        return "test";
    }
    //说明：如果使用对象的话，前端传递的参数名和对象名必须一致，否则就是null。
    //http://localhost:8083/user/t2?name=jarod&id=1&age=3
    @GetMapping("/t2")
    public String user(User user){
        System.out.println(user);
        return "test";
    }
}
//        Model 只有寥寥几个方法只适合用于储存数据，简化了新手对于Model对象的操作和理解；
//
//        ModelMap 继承了 LinkedMap ，除了实现了自身的一些方法，同样的继承 LinkedMap 的方法和特性；
//
//        ModelAndView 可以在储存数据的同时，可以进行设置返回的逻辑视图，进行控制展示层的跳转。
