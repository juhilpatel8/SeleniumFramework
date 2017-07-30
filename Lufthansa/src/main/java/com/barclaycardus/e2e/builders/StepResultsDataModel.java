package com.barclaycardus.e2e.builders;

import com.barclaycardus.e2e.utils.CobaltTestUtils;
import com.jayway.restassured.path.json.JsonPath;

/**
 * Created by Juhil on 7/23/2017.
 */
public class StepResultsDataModel {

    private String firstName;

    private String lastName;

    private String emailId;

    private String customerId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Override
    public String toString() {
       StringBuilder resultsBuilder= CobaltTestUtils.prettifyObject(this,"emailId");
        return JsonPath.from(resultsBuilder.toString()).prettify();
    }
}
