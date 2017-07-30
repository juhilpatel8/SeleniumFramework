package com.barclaycardus.domain.database.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

//import com.cardus.*;
import java.util.Random;

/**
 * Created by Juhil on 7/16/2017.
 */
@Configuration
public class LoanApplicationViewHelper {
//
//  @Autowired
//  PersonsSercieImpl personsServiceImpl;
//
//  @Autowired
//  UserAccountServiceImpl userAccountServiceImpl;

    public String getEmailId()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String emailId= "username"+ randomInt +"@gmail.com";
        return emailId;
    }
}
