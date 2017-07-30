package com.barclaycardus.data;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Juhil on 7/28/2017.
 */
@SpringBootApplication
@ComponentScan(value = "com.barclaycardus")
@Configuration
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class);
    }

    @Bean
    public StandardPBEStringEncryptor encryptor()
    {
        StandardPBEStringEncryptor encryptor=new StandardPBEStringEncryptor();
        encryptor.setPassword("@END2END@");
        return encryptor;
    }
}
