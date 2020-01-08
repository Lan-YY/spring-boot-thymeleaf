package com.thymeleaf.web.controller;

import com.thymeleaf.pojo.User;
import com.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;

/**
 * Package: com.thymeleaf.web.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 作者
 * <p>
 * Date: Created in 2020/1/4 9:01
 * <p>
 * Company: 公司
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
@Controller
public class ExampleController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello/{id}")
    public String getUser(@PathVariable("id") Long userid, Model model){
        User user =userService.getUser(userid);
        model.addAttribute("user",user);
        model.addAttribute("userName","ktjiaoyu"); //演示赋值、字符串拼接
        return "demo/hello";
    }

    @GetMapping(value = "/string")
    public String getString(Model model, HttpServletRequest request){
        model.addAttribute("userName","ktjiaoyu");
        model.addAttribute("test","123");
        request.setAttribute("test","request");
        request.setAttribute("test123","reque213123st");
        request.getSession().setAttribute("test","session");
        model.addAttribute("date",new Date());
        return "demo/string";
    }

    @GetMapping(value = "/if")
    public String ifunless(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("sex","man");
        return "demo/if";
    }

    @GetMapping(value = "/list")
    public String list(Model model){
        List<User> list = userService.findAllUsers();
        System.out.println(list);
        model.addAttribute("users",list);
        return "demo/list";
    }

    @GetMapping(value = "index")
    public String index(){
        return "demo/index";
    }

    @GetMapping(value = "fragment")
    public String layout(){
        return "demo/fragment";
    }

    @GetMapping(value = "/test")
    public String main(){
        return "demo/test";
    }

}
