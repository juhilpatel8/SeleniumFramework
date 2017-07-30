package main.java.com.cardus.data.service.impl;

import main.java.com.cardus.data.entities.Persons;
import main.java.com.cardus.data.repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 * Created by Juhil on 7/28/2017.
 */

@Service
public class PersonsServiceImpl {

PersonsRepository personsRepository;
    EntityManager entityManager;


    @Autowired
    public void setProductRepository(PersonsRepository personsRepository,EntityManager entityManager)
    {
        this.personsRepository=personsRepository;
        this.entityManager=entityManager;
    }

    public Iterable<Persons> listAllPersons()
    {
        return personsRepository.findAll();
    }

    public Persons listAllPersonsById(String id)
    {
        return personsRepository.findOne(id);
    }

    public Persons listAllPersonsByEmailId(String emailId)
    {
        Persons persons=null;
        try
        {
            persons=entityManager.createQuery("from Persons where emailid=:emailId",Persons.class)
                    .setParameter("emailId",emailId)
                    .getSingleResult();
        }
        catch (NoResultException e)
        {
            return null;
        }
        return persons;
    }
   public String getPhoneNumber(String startAreaCode)
   {
       String phoneNumberFromDB=(String) entityManager.createQuery("select max(p.phonenumber) from Persons p where p.phonenumber like '" + startAreaCode+ "%'")
       .getSingleResult();

       return phoneNumberFromDB;
   }

}
