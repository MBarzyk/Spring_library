package com.javagda25.spring.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller ("/")// default request mapping "/"
public class IndexController {

    @GetMapping("/") // default request mapping "/"
    public String index() {
        return "index";
    }
}