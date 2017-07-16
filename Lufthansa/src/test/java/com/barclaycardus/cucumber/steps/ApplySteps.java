package com.barclaycardus.cucumber.steps;

import com.barclaycardus.cucumber.ConsumerLendingSteps;
import com.barclaycardus.domain.HelperFactory;
import com.barclaycardus.domain.interfaces.Apply;
import com.barclaycardus.e2e.builders.LoanApplicantBuilder;
import com.barclaycardus.e2e.builders.LoanApplicantType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Juhil on 3/20/2016.
 */

public class ApplySteps extends ConsumerLendingSteps
        {

    @Given("^a (.*?) applies for consumer Loan$")
    public void a_AUTODECLINE_ACTOR_applies_for_consumer_Loan(String applicantType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        applicantBuilder.init(LoanApplicantType.fromValue(applicantType));
        getApplyHelper().submitALoanApplication(applicantBuilder);
     }

    @When("^he logs into the application tracker$")
    public void he_logs_into_the_application_tracker() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     }

    @Then("^his loan application status should be DECLINED$")
    public void his_loan_application_status_should_be_DECLINED() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
