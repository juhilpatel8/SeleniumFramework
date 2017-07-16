package com.barclaycardus.domain.ui.helpers;

import com.barclaycardus.domain.database.helpers.LoanApplicationViewHelper;
import com.barclaycardus.domain.interfaces.ShoppingCart;
import com.barclaycardus.e2e.builders.ShopingCartApplicant;
import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.CreateAnAccountPage;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.FillUpCreateAnAccountPage;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/16/2017.
 */
@Component
public class ShoppingCartUIHelper  implements ShoppingCart{

    @Autowired
    LoanApplicationViewHelper loanApplicationViewHelper;

    public void submitASignUpApplication(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder) throws Throwable {
       ShopingCartApplicant shopingCartApplicant=shoppingCartApplicantBuilder.buildShopingCartApplicant();

        String emailId =loanApplicationViewHelper.getEmailId();
        shopingCartApplicant.setEmailAddress(emailId);
        System.out.println("Email id  ::"+emailId);

        SignInPage signInPage=new SignInPage().init();
        signInPage.SignInPage();

        CreateAnAccountPage createAnAccountPage=new CreateAnAccountPage().init();
        createAnAccountPage.CreateAnAccountPage(shopingCartApplicant.getEmailAddress());

        FillUpCreateAnAccountPage fillUpCreateAnAccountPage=new FillUpCreateAnAccountPage().init();
        fillUpCreateAnAccountPage.fillUpCreateAnAccountPage(shopingCartApplicant);
    }
}
