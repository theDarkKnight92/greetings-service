package com.demo.greetingsservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/greetings")
public class GreetingsController {

    @GetMapping("/ping")
    public String reply() {
        return "Hello World";
    }
}
