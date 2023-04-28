package br.com.cleartech.devopstest.services;

import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class HelloService {

    public String hello() {
        log.info( "Hello Devops" );
        return "Hello Devops";
    }

}
