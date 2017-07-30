package com.barclaycardus.e2e.builders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 3/27/2016.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ShoppingCartApplicantBuilder {

    @Autowired
    private ShopingCartApplicant applicant;
    private ShopingCartApplicantType applicantType;
    private String loanReferenceNumber = null;

    private String emailIdJson;
    private String createAnAccountJson;


    public String getCreateAnAccountJson() {
        return createAnAccountJson;
    }

    public void setCreateAnAccountJson(String createAnAccountJson) {
        this.createAnAccountJson = createAnAccountJson;
    }

    public String getEmailIdJson() {
        return emailIdJson;
    }

    public void setEmailIdJson(String emailIdJson) {
        this.emailIdJson = emailIdJson;
    }


    public ShopingCartApplicant getApplicant() {
        return applicant;
    }

    public void setApplicant(ShopingCartApplicant applicant) {
        this.applicant = applicant;
    }

    public ShopingCartApplicantType getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(ShopingCartApplicantType applicantType) {
        this.applicantType = applicantType;
    }

    public String getLoanReferenceNumber() {
        return loanReferenceNumber;
    }

    public void setLoanReferenceNumber(String loanReferenceNumber) {
        this.loanReferenceNumber = loanReferenceNumber;
    }

    public ShoppingCartApplicantBuilder init(ShopingCartApplicantType shopingcartapplicanttype) {
        applicantType = shopingcartapplicanttype;
         applicant = new ShopingCartApplicant();
        return this;
    }

    public ShopingCartApplicant buildShopingCartApplicant() {
        if (applicantType.equals(ShopingCartApplicantType.POSITIVE_ACTOR)) {
            return applicant;
        } else if (applicantType.equals(ShopingCartApplicantType.NEGATIVE_ACTOR)) {
            return autoDeclineActor();
        } else {
            return null;
        }
    }

    public ShopingCartApplicant autoDeclineActor() {
        applicant.setFirstName("fake");
        return applicant;
    }
    public ShopingCartApplicant negativeActor() {
        applicant.setFirstName("");
        applicant.setEmailAddress("x@bcus.com");
        return applicant;
    }

}

