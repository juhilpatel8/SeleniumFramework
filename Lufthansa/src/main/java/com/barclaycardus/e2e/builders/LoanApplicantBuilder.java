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
public class LoanApplicantBuilder {

    @Autowired
    private LoanApplicant applicant;
    private LoanApplicantType applicantType;
    private String loanReferenceNumber = null;
    public LoanApplicant getApplicant() {
        return applicant;
    }

    public void setApplicant(LoanApplicant applicant) {
        this.applicant = applicant;
    }

    public LoanApplicantType getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(LoanApplicantType applicantType) {
        this.applicantType = applicantType;
    }

    public String getLoanReferenceNumber() {
        return loanReferenceNumber;
    }

    public void setLoanReferenceNumber(String loanReferenceNumber) {
        this.loanReferenceNumber = loanReferenceNumber;
    }

    public LoanApplicantBuilder init(LoanApplicantType loanApplicantType) {
        applicantType = loanApplicantType;
        applicant = new LoanApplicant();
        return this;
    }

    public LoanApplicant buildLoanApplicant() {
        if (applicantType.equals(LoanApplicantType.AUTOAPPROVE_ACTOR)) {
            return applicant;
        } else if (applicantType.equals(LoanApplicantType.AUTODECLINE_ACTOR)) {
            return autoDeclineActor();
        } else {
            return null;
        }
    }

    public LoanApplicant autoDeclineActor() {
        applicant.setFirstName("fake");
        return applicant;
    }
    public LoanApplicant negativeActor() {
        applicant.setFirstName("");
        applicant.setEmailAddress("x@bcus.com");
        return applicant;
    }

}

