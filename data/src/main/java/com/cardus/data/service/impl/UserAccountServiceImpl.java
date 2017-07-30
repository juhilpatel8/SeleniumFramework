package main.java.com.cardus.data.service.impl;

import main.java.com.cardus.data.entities.UserAccount;
import main.java.com.cardus.data.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 * Created by Juhil on 7/28/2017.
 */

@Service
public class UserAccountServiceImpl {

UserAccountRepository userAccountRepository;

EntityManager entityManager;

@Autowired
public void setProductRepository(UserAccountRepository userAccountRepository, EntityManager entityManager)
{
    this.userAccountRepository=userAccountRepository;
    this.entityManager=entityManager;
}

public Iterable<UserAccount> listAllAccounts()
{
    return userAccountRepository.findAll();
}

public UserAccount listAllUserAccountById(String id)
{
    return userAccountRepository.findOne(id);
}

public UserAccount listAllUserAccountByEmailId(String emailId)
{
    UserAccount userAccount=null;
    try
    {
        userAccount=entityManager.createQuery("from UserAccount where emailid=:emailId",UserAccount.class)
         .setParameter("emailId",emailId)
         .getSingleResult();
    }
    catch (NoResultException e)
    {
        return null;
    }
        return userAccount;
}


    public UserAccount listAllUserAccountByPassword(String password)
    {
        UserAccount userAccount=null;
        try
        {
            userAccount=entityManager.createQuery("from UserAccount where password=:passWord",UserAccount.class)
                    .setParameter("passWord",password)
                    .getSingleResult();
        }
        catch (NoResultException e)
        {
            return null;
        }
        return userAccount;
    }



}
