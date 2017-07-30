package com.barclaycardus.cucumber.steps;

import com.barclaycardus.cucumber.ConsumerLendingSteps;
import com.barclaycardus.domain.database.helpers.LoanApplicationViewHelper;
import com.barclaycardus.e2e.builders.LoanApplicantType;
import com.barclaycardus.e2e.builders.ShopingCartApplicant;
import com.barclaycardus.e2e.builders.ShopingCartApplicantType;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Juhil on 3/20/2016.
 */

public class ShoppingSteps extends ConsumerLendingSteps {

    @Autowired
    LoanApplicationViewHelper loanApplicationViewHelper;

//    @Given("^a (.*?) applies for consumer Loan$")
//    public void a_AUTODECLINE_ACTOR_applies_for_consumer_Loan(String applicantType) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        applicantBuilder.init(LoanApplicantType.fromValue(applicantType));
//        getApplyHelper().submitALoanApplication(applicantBuilder);
//     }

//    @Given("^\"(.*?)\" go to \"(.*?)\" on \"(.*?)\"$")
//    public void go_to_on(String shoppingCartApplicantType, String url, String browser) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        shopingcartapplicantBuilder.init(ShopingCartApplicantType.fromValue(shoppingCartApplicantType));
//        getShoppingCartHelper().submitASignUpApplication(shopingcartapplicantBuilder);
//    }




    @Given("^\"(.*?)\" go to \"(.*?)\" And I click on \"(.*?)\" section$")
    public void go_to_And_I_click_on_section(String shoppingCartApplicantType, String url, String browser)
            throws Throwable {

        ShopingCartApplicant shopingCartApplicant=new ShopingCartApplicant();
        String emailId =loanApplicationViewHelper.getEmailId();
        shopingCartApplicant.setEmailAddress(emailId);
        shopingcartapplicantBuilder.setApplicant(shopingCartApplicant);
        shopingcartapplicantBuilder.setApplicantType(ShopingCartApplicantType.fromValue(shoppingCartApplicantType));
//
//        shopingcartapplicantBuilder.init(ShopingCartApplicantType.fromValue(shoppingCartApplicantType));
//        ShopingCartApplicant shopingCartApplicant=shopingcartapplicantBuilder.buildShopingCartApplicant();
//        String emailId =loanApplicationViewHelper.getEmailId();
//        shopingCartApplicant.setEmailAddress(emailId);
        getShoppingCartHelper().clickOnSignInSection(shopingcartapplicantBuilder);
    }

    @When("^I enter \"(.*?)\" as \"(.*?)\" then click on \"(.*?)\" button$")
    public void i_enter_as_then_click_on_button(String emaild, String arg2, String arg3) throws Throwable {
        getShoppingCartHelper().clickOnCreateAnAccount(shopingcartapplicantBuilder);
    }


    @When("^Enter personal information and click on submit button$")
    public void enter_personal_information_and_click_on_submit_button() throws Throwable {
        getShoppingCartHelper().submitPersonalInformation(shopingcartapplicantBuilder);
    }

    @Then("^I can view ORDER HISTORY And DETAILS button$")
    public void i_can_view_ORDER_HISTORY_And_DETAILS_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getShoppingCartHelper().submitViewOrderHistoryAndDetails(shopingcartapplicantBuilder);

    }


    @Given("^\"([^\"]*)\" go to shoppingcart website And clicks on \"([^\"]*)\" link$")
    public void goToShoppingcartWebsiteAndClicksOnLink(String shoppingCartApplicantType, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopingcartapplicantBuilder.setApplicantType(ShopingCartApplicantType.fromValue(shoppingCartApplicantType));
        getShoppingCartHelper().clickOnSignInSection(shopingcartapplicantBuilder);

    }

    @When("^he enters email as \"([^\"]*)\" then clicks on create an account button$")
    public void heEntersEmailAsThenClicksOnCreateAnAccountButton(String emailId) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ShopingCartApplicant shopingCartApplicant=new ShopingCartApplicant();
        shopingCartApplicant.setEmailAddress(emailId);
        shopingcartapplicantBuilder.setApplicant(shopingCartApplicant);
        getShoppingCartHelper().clickOnCreateAnAccount(shopingcartapplicantBuilder);

    }

    @And("^Enter personal information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and click on submit button$")
    public void enterPersonalInformationAndClickOnSubmitButton(String title, String firstName, String lastName, String primaryEmail, String phoneNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step personal information-->"+"title:"+title+"First Name:"+firstName+"Last Name:"+lastName+"Phone Number:"+phoneNumber+primaryEmail);

        ShopingCartApplicant shopingCartApplicant=new ShopingCartApplicant();
        shopingCartApplicant.setFirstName(firstName);
        shopingCartApplicant.setLastName(lastName);
        shopingCartApplicant.setEmailAddress(primaryEmail);
        shopingCartApplicant.setAddressMobilePhone(phoneNumber);
        shopingcartapplicantBuilder.setApplicant(shopingCartApplicant);

        getBuildShoppingCartAccount().buildCreateAccountJson(shopingcartapplicantBuilder);
        getShoppingCartHelper().submitPersonalInformation(shopingcartapplicantBuilder);

    }

    @Then("^he can view ORDER HISTORY And DETAILS button$")
    public void heCanViewORDERHISTORYAndDETAILSButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getShoppingCartHelper().submitViewOrderHistoryAndDetails(shopingcartapplicantBuilder);
    }

    @And("^click on HyperLink to verify order history$")
    public void clickOnHyperLinkToVerifyOrderHistory() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getShoppingCartHelper().verifyOrderHistory(shopingcartapplicantBuilder);
    }
}
