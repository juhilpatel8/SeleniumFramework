package com.barclaycardus.domain.ui.helpers;

import com.barclaycardus.domain.database.helpers.LoanApplicationViewHelper;
import com.barclaycardus.domain.interfaces.ShoppingCart;
import com.barclaycardus.e2e.builders.ShopingCartApplicant;
import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.CreateAnAccountPage;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.FillUpCreateAnAccountPage;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage;
import com.barclaycardus.e2e.ui.pages.ShoppingCart.ViewOrderHistoryAndDetailsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/16/2017.
 */
@Component
public class ShoppingCartUIHelper implements ShoppingCart{

    @Autowired
    LoanApplicationViewHelper loanApplicationViewHelper;

//    public void submitASignUpApplication(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder) throws Throwable
//    {
//       ShopingCartApplicant shopingCartApplicant=shoppingCartApplicantBuilder.buildShopingCartApplicant();
//        String emailId =loanApplicationViewHelper.getEmailId();
//        shopingCartApplicant.setEmailAddress(emailId);
//        System.out.println("Email id  ::"+emailId);
//        SignInPage signInPage=new SignInPage().init();
//        CreateAnAccountPage createAnAccountPage=signInPage.SignInPage();
//
////        CreateAnAccountPage createAnAccountPage=new CreateAnAccountPage().init();
//        createAnAccountPage.CreateAnAccountPage(shopingCartApplicant.getEmailAddress());
//
//        FillUpCreateAnAccountPage fillUpCreateAnAccountPage=new FillUpCreateAnAccountPage().init();
//        fillUpCreateAnAccountPage.fillUpCreateAnAccountPage(shopingCartApplicant);
//    }

    @Override
    public void clickOnSignInSection(ShoppingCartApplicantBuilder shopingcartapplicantBuilder) throws Throwable {
//        ShopingCartApplicant shopingCartApplicant=shopingcartapplicantBuilder.buildShopingCartApplicant();
//        String emailId =loanApplicationViewHelper.getEmailId();
//        shopingCartApplicant.setEmailAddress(emailId);
        SignInPage signInPage=new SignInPage().init();
        signInPage.SignInPage();

    }

    @Override
    public void clickOnCreateAnAccount(ShoppingCartApplicantBuilder shopingcartapplicantBuilder) throws Throwable {
//        shopingcartapplicantBuilder =new ShoppingCartApplicantBuilder();
        System.out.println("Applicant Email Id::"+shopingcartapplicantBuilder.getApplicant().getEmailAddress());
        CreateAnAccountPage createAnAccountPage=new CreateAnAccountPage().init();
        createAnAccountPage.CreateAnAccountPage(shopingcartapplicantBuilder.getApplicant().getEmailAddress());

    }

    @Override
    public void submitPersonalInformation(ShoppingCartApplicantBuilder shopingcartapplicantBuilder) throws Throwable {
        System.out.println("Step Submit Account Information::"+"First Name::"+shopingcartapplicantBuilder.getApplicant().getFirstName()+"Last Name::"+shopingcartapplicantBuilder.getApplicant().getLastName()+"Email Id::"+shopingcartapplicantBuilder.getApplicant().getEmailAddress()+"Password::"+shopingcartapplicantBuilder.getApplicant().getPassword()+"Address Mobile Phone"+shopingcartapplicantBuilder.getApplicant().getAddressMobilePhone());
        FillUpCreateAnAccountPage fillUpCreateAnAccountPage=new FillUpCreateAnAccountPage().init();
        fillUpCreateAnAccountPage.fillUpCreateAnAccountPage(shopingcartapplicantBuilder.getApplicant());
    }

    @Override
    public void submitViewOrderHistoryAndDetails(ShoppingCartApplicantBuilder shopingcartapplicantBuilder) throws Throwable {
        System.out.println("Step 4 : Inspect Order History And Details");
        ViewOrderHistoryAndDetailsPage viewOrderHistoryAndDetailsPage=new ViewOrderHistoryAndDetailsPage().init();
        viewOrderHistoryAndDetailsPage.viewOrderHistoryAndDetailsPage(shopingcartapplicantBuilder.getApplicant().getEmailAddress());
    }


}
