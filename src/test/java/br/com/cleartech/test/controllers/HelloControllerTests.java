package br.com.cleartech.test.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.cleartech.devopstest.controllers.HelloController;
import br.com.cleartech.devopstest.services.HelloService;

@ExtendWith( MockitoExtension.class )
public class HelloControllerTests {

    @Mock
    private HelloService helloService;

    @InjectMocks
    private HelloController helloController;

    @Test
    void helloTest() {
        when( helloService.hello() ).thenReturn( "Hello Devops" );

        String response = helloController.index();
        assertEquals( "Hello Devops", response );
    }
}
