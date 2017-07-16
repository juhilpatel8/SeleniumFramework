package com.barclaycardus.e2e.builders;

import com.barclaycardus.e2e.utils.CobaltTestUtils;
import org.springframework.stereotype.Component;


/**
 * Created by Juhil on 3/27/2016.
 */
@Component
public class ShopingCartApplicant {
    private String firstName="JUHIL";
    private String lastName="ITQA";
    private String emailAddress=null;
    private String password=null;

    private String addressFirstName="JUHIL";
    private String addressLastName="ITQA";
    private String addressCompany="WISHTREE";
    private String addressLine1="2500 KNIGHTS RD";
    private String addressLine2="APT 37-05";
    private String addressCity="BENSALEM";
    private String addressState="PA";
    private String addressZipCode="19020";
    private String addressCountry="United State";
    private String addressAdditionalInformation="Please drop off my package at locker box";
    private String addressHomePhone="2674603277";
    private String addressMobilePhone=null;
    private String addressAlias="Home Address";

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

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddressFirstName() {
        return addressFirstName;
    }

    public void setAddressFirstName(String addressFirstName) {
        this.addressFirstName = addressFirstName;
    }

    public String getAddressLastName() {
        return addressLastName;
    }

    public void setAddressLastName(String addressLastName) {
        this.addressLastName = addressLastName;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(String addressZipCode) {
        this.addressZipCode = addressZipCode;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressAdditionalInformation() {
        return addressAdditionalInformation;
    }

    public void setAddressAdditionalInformation(String addressAdditionalInformation) {
        this.addressAdditionalInformation = addressAdditionalInformation;
    }

    public String getAddressHomePhone() {
        return addressHomePhone;
    }

    public void setAddressHomePhone(String addressHomePhone) {
        this.addressHomePhone = addressHomePhone;
    }

    public String getAddressMobilePhone() {
        return addressMobilePhone;
    }

    public void setAddressMobilePhone(String addressMobilePhone) {
        this.addressMobilePhone = addressMobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        this.addressAlias = addressAlias;
    }

    public String getEmailAddress() {
        if(null ==emailAddress)
        {
            emailAddress=String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com";
        }

        return emailAddress;
    }


}
