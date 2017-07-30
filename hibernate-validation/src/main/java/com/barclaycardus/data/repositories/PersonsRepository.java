package com.barclaycardus.data.repositories;

import com.barclaycardus.data.entities.Persons;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juhil on 7/29/2017.
 */
public interface PersonsRepository extends CrudRepository<Persons,String>{
}
