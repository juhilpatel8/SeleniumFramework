package com.barclaycardus.e2e.builders;

import com.barclaycardus.e2e.utils.CobaltTestUtils;
import org.springframework.stereotype.Component;


/**
 * Created by Juhil on 3/27/2016.
 */
@Component
public class LoanApplicant {
    private String firstName="AUTOENDTOEND";
    private String lastName="ITQA";
    private String middleName=null;
    private String suffix="JR";
    private String emailAddress=null;
    private String moneyNeeded="10000";
    private String loanPurpose="Debt Consolidation";
    private String creditEstimation="Exceptional";
    private final String SSN_AUTOMATION_CONSTANT="325";
    private String inviatationCode=null;
    private String ssn=null;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreditEstimation() {
        return creditEstimation;
    }

    public void setCreditEstimation(String creditEstimation) {
        this.creditEstimation = creditEstimation;
    }

    public String getSSN_AUTOMATION_CONSTANT() {
        return SSN_AUTOMATION_CONSTANT;
    }

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

    public String getMiddleName() {
       if(null==middleName)
       {
           middleName= CobaltTestUtils.getRandomMI();
       }
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getMoneyNeeded() {
        return moneyNeeded;
    }

    public void setMoneyNeeded(String moneyNeeded) {
        this.moneyNeeded = moneyNeeded;
    }
    public String getEmailAddress() {
        if(null ==emailAddress)
        {
            emailAddress=String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com";
        }

        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
    public String getInviatationCode() {
        if(null == inviatationCode)
        {
            inviatationCode= String.valueOf(Math.random()).substring(2,13);
        }
        return inviatationCode;
    }

    public void setInviatationCode(String inviatationCode) {
        this.inviatationCode = inviatationCode;
    }

}
