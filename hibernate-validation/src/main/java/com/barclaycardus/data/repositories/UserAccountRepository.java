package com.barclaycardus.data.repositories;

import com.barclaycardus.data.entities.UserAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juhil on 7/29/2017.
 */
public interface UserAccountRepository extends CrudRepository<UserAccount,String> {
}

