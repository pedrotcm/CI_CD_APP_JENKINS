package br.com.cleartech.devopstest.services;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class HelloService {

    public String hello() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        var random = new Random();
        var hello = "Hello Devops";
        log.info( " {} {}", hello, random.nextInt() );

        byte[] bytesOfMessage = hello.getBytes( "UTF-8" );
        MessageDigest md = MessageDigest.getInstance( "MD5" );
        byte[] theMD5digest = md.digest( bytesOfMessage );

        log.info( "Hash {}", new String( theMD5digest ) );

        return "Hello Devops";
    }

}
