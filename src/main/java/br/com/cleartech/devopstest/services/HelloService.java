package br.com.cleartech.devopstest.services;

import java.util.Random;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class HelloService {

    public String hello() {
        var random = new Random();
        log.info( "Hello Devops {}", random.nextInt() );
        return "Hello Devops";
    }

}
