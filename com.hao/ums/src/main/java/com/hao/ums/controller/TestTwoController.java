package com.hao.ums.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demot")
public class TestTwoController {

    @GetMapping("test")
    public String test() {
        return "Hello World!";
    }
}
