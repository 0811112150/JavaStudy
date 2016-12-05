package com.liming.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aa on 2016/12/5.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello";
    }
}
