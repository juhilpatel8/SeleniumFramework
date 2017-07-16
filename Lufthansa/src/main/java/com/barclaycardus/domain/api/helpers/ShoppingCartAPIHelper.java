package com.barclaycardus.domain.api.helpers;

import com.barclaycardus.domain.abstracts.AbstractsApplyApiHelper;
import com.barclaycardus.domain.abstracts.AbstractsShoppingCartApiHelper;
import com.barclaycardus.e2e.builders.LoanApplicantBuilder;
import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/31/2016.
 */
@Component
public class ShoppingCartAPIHelper extends AbstractsShoppingCartApiHelper{

    @Override
    public void submitASignUpApplication(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder) throws Throwable {
        System.out.println("ShoppingCart API");

    }
}
