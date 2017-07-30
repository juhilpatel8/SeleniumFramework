package com.barclaycardus.data.service;

import com.barclaycardus.data.Application;
import com.barclaycardus.data.entities.Persons;
import com.barclaycardus.data.entities.UserAccount;
import com.barclaycardus.data.service.impl.PersonsServiceImpl;
import com.barclaycardus.data.service.impl.UserAccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Juhil on 7/28/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Application.class, loader= SpringApplicationContextLoader.class)
public class ServiceTest
{

    @Autowired
    PersonsServiceImpl personsService;

    @Autowired
    UserAccountServiceImpl userAccountService;

    @Test
    public void testPersons()
    {
        Persons persons=personsService.listAllPersonsByEmailId("juhilpatel32@gmail.com");
        System.out.println("Persons db::"+persons.getFirstName()+"::"+persons.getLastName());
//        System.out.println(personsService.getPhoneNumber("267"));

        UserAccount userAccount=userAccountService.listAllUserAccountByEmailId("juhilpatel32@gmail.com");
        System.out.println("User Account DB::"+userAccount.getPassword());
    }


}
