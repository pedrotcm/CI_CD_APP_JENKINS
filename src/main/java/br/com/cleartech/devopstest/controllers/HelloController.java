package br.com.cleartech.devopstest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping( "/hello" )
@Log4j2
public class HelloController {
    
    @GetMapping
    public String index() {
        log.info( "Hello Devops" );
        return "Hello Devops 2";
    }
    
}