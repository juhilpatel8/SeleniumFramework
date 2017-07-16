package com.barclaycardus.cucumber.steps;

import com.barclaycardus.cucumber.ConsumerLendingSteps;
import com.barclaycardus.e2e.builders.LoanApplicantType;
import com.barclaycardus.e2e.builders.ShopingCartApplicantType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Juhil on 3/20/2016.
 */

public class ShoppingSteps extends ConsumerLendingSteps
        {

//    @Given("^a (.*?) applies for consumer Loan$")
//    public void a_AUTODECLINE_ACTOR_applies_for_consumer_Loan(String applicantType) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        applicantBuilder.init(LoanApplicantType.fromValue(applicantType));
//        getApplyHelper().submitALoanApplication(applicantBuilder);
//     }

            @Given("^\"(.*?)\" go to \"(.*?)\" on \"(.*?)\"$")
            public void go_to_on(String shoppingCartApplicantType, String url, String browser) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                shopingcartapplicantBuilder.init(ShopingCartApplicantType.fromValue(shoppingCartApplicantType));
                getShoppingCartHelper().submitASignUpApplication(shopingcartapplicantBuilder);
            }

            @Given("^I enter \"(.*?)\" as \"(.*?)\"$")
            public void i_enter_as(String arg1, String arg2) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

            @Given("^I click on \"(.*?)\"$")
            public void i_click_on(String arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

            @Then("^Login should be \"(.*?)\"$")
            public void login_should_be(String arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

            @Given("^I click on \"(.*?)\" section$")
            public void i_click_on_section(String arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

            @Given("^I click on \"(.*?)\" button$")
            public void i_click_on_button(String arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

            @Given("^Enter personal information$")
            public void enter_personal_information() throws Throwable {
                // Write code here that turns the phrase above into concrete actions
            }

        }
