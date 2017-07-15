package com.barclaycardus.cucumber;



import com.barclaycardus.e2e.utils.CucumberUtils;
import com.barclaycardus.e2e.utils.JourneyEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.retry.annotation.EnableRetry;

/**
 * Created by Juhil on 3/27/2016.
 */
@SpringBootApplication
@EnableRetry
@ComponentScan(value = "com.barclaycardus")
@Configuration
//@Import(value={com.barclaycardus.data.Application.class, com.barclaycardus.Application.class})
@Import(value = {})
public class Application implements CommandLineRunner{

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        if(JourneyEnum.USER.name().equalsIgnoreCase(CucumberUtils.getJourneyType()))
        {
            System.setProperty("browsername","chrome");
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        }
    }
}
