package com.liming.www.controller;

import com.liming.www.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class HomeControler {

    @Resource
    private IStudentService studentService;

    @RequestMapping("login") //用来处理前台的login请求
    private ModelAndView hello(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password
    ) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", username);
        modelAndView.setViewName("Welcome");
        modelAndView.getModel().put("userName", username);
        studentService.insertStudent("test");
//        boolean result = studentService.insertStudent("zhanglm");

        return modelAndView;

//        return "Hello " + username + ",Your password is: " + password;
    }
}