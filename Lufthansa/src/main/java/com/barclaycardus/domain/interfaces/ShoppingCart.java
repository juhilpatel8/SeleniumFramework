package com.barclaycardus.domain.interfaces;

import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;

/**
 * Created by Juhil on 3/20/2016.
 */
public interface ShoppingCart {
     void submitASignUpApplication(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder) throws Throwable;
}
