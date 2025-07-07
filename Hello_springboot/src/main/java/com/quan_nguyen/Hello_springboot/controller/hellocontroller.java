package com.quan_nguyen.Hello_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class hellocontroller {

    @GetMapping("/hello")
    public String hello() {
        return "hello" ;
    }
}
