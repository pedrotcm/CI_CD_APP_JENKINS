package br.com.cleartech.devopstest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cleartech.devopstest.services.HelloService;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping( "/hello" )
@Log4j2
public class HelloController {
    
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String index() {
        log.info( "Call helloService.hello()" );
        return helloService.hello();
    }
    
}