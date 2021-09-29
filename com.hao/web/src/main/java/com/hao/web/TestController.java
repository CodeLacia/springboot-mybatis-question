package com.hao.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class TestController {

    @GetMapping("test")
    public String test() {
        return "Hello World!";
    }
}
