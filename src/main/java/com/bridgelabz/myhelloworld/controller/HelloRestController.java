package com.bridgelabz.myhelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloRestController {

    @RequestMapping("/")
    public String index() {
        return "Hello from bridgelabz";
    }

}