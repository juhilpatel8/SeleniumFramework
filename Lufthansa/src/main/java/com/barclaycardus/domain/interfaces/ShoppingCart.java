package com.barclaycardus.domain.interfaces;

import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;

/**
 * Created by Juhil on 3/20/2016.
 */
public interface ShoppingCart {

     void clickOnSignInSection(ShoppingCartApplicantBuilder shopingcartapplicantBuilder) throws Throwable;

     void clickOnCreateAnAccount(ShoppingCartApplicantBuilder shopingcartapplicantBuilder)throws Throwable;

     void submitPersonalInformation(ShoppingCartApplicantBuilder shopingcartapplicantBuilder)throws Throwable;
}
