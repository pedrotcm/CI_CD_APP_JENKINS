package br.com.cleartech.devopstest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/hello" )
public class HelloController {
    
    @GetMapping
    public String index() {
        return "Hello Devops";
    }
    
}