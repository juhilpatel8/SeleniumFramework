package main.java.com.cardus.data;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Basic;

/**
 * Created by Juhil on 7/28/2017.
 */
@SpringBootApplication
@ComponentScan(value = "com.cardus.data")
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
