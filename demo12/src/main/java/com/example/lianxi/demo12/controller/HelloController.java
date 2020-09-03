package com.example.lianxi.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//这个类的所有方法返回的数据直接写给浏览器 （如果是对象,转为json数据）
@ResponseBody
@Controller
public class HelloController {

    @RequestMapping("/hello")
        public String hello(){
            return "hello Spring bootf冯欢";
        }
    }


