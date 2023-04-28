package br.com.cleartech.test.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.cleartech.devopstest.services.HelloService;

@ExtendWith( MockitoExtension.class )
public class HelloServiceTests {

    @InjectMocks
    private HelloService helloService;

    @Test
    void helloTest() {
        String result = helloService.hello();
        assertEquals( "Hello Devops", result );
    }

}
