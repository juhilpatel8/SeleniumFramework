package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.builders.ShopingCartApplicant;
import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Juhil on 7/30/2016.
 */
public class FillUpCreateAnAccountPage extends ChannelsWebPage<FillUpCreateAnAccountPage> {

    @FindBy(id = "id_gender1")
    private WebElement titleId;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameId;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameId;

    @FindBy(id = "email")
    private WebElement emailId;

    @FindBy(id = "passwd")
    private WebElement passwordId;

    @FindBy(id = "days")
    private WebElement dobDays;

    @FindBy(id = "months")
    private WebElement dobMonths;

    @FindBy(id = "years")
    private WebElement dobYears;

    @FindBy(id = "firstname")
    private WebElement addressFirstNameId;

    @FindBy(id = "lastname")
    private WebElement addressLastNameId;

    @FindBy(id = "company")
    private WebElement addressCompanyId;

    @FindBy(id = "address1")
    private WebElement address1Id;

    @FindBy(id = "address2")
    private WebElement address2Id;

    @FindBy(id = "city")
    private WebElement addressCityId;

    @FindBy(id = "id_state")
    private WebElement stateId;

    @FindBy(id = "postcode")
    private WebElement zipcodeId;

    @FindBy(id = "id_country")
    private WebElement addressCountryId;

    @FindBy(id = "other")
    private WebElement addressOtherInformationId;

    @FindBy(id = "phone")
    private WebElement homePhoneId;

    @FindBy(id = "phone_mobile")
    private WebElement addressMobilePhoneId;

    @FindBy(id = "alias")
    private WebElement addressCreateAnAlias;

    @FindBy(id = "submitAccount")
    private WebElement submitAccountButtonId;

    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public FillUpCreateAnAccountPage init() {
        return openPage(FillUpCreateAnAccountPage.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "submitAccount";
    }

    public void fillUpCreateAnAccountPage(ShopingCartApplicant shopingCartApplicant) {
        // ApplyButton.click();
        // return new LoanApplicationPge().init();
//        Select selectSuffix= new Select(titleId);
//        selectSuffix.selectByIndex(2);
        emailId.clear();
        titleId.click();

        firstNameId.sendKeys(shopingCartApplicant.getFirstName());
        lastNameId.sendKeys(shopingCartApplicant.getLastName());
        emailId.sendKeys(shopingCartApplicant.getEmailAddress());
        passwordId.sendKeys(shopingCartApplicant.getPassword());

        Select selectDobDays= new Select(dobDays);
        selectDobDays.selectByIndex(1);
        Select selectDobMonths= new Select(dobMonths);
        selectDobMonths.selectByIndex(2);
        Select selectDobYears= new Select(dobYears);
        selectDobYears.selectByIndex(3);
        /**
         *
         * Select selectResidentStatusId= new Select(residentStatusID);
         * selectResidentStatusId.selectByVisibleText(applicant.getResidentStatus());
         */

        addressFirstNameId.sendKeys(shopingCartApplicant.getAddressFirstName());
        addressLastNameId.sendKeys(shopingCartApplicant.getAddressLastName());
        addressCompanyId.sendKeys(shopingCartApplicant.getAddressCompany());
        address1Id.sendKeys(shopingCartApplicant.getAddressLine1());
        address2Id.sendKeys(shopingCartApplicant.getAddressLine2());
        addressCityId.sendKeys(shopingCartApplicant.getAddressCity());
        stateId.sendKeys(shopingCartApplicant.getAddressState());
        zipcodeId.sendKeys(shopingCartApplicant.getAddressZipCode());
        addressCountryId.sendKeys(shopingCartApplicant.getAddressCountry());
        addressOtherInformationId.sendKeys(shopingCartApplicant.getAddressAdditionalInformation());
        homePhoneId.sendKeys(shopingCartApplicant.getAddressHomePhone());
        addressMobilePhoneId.sendKeys(shopingCartApplicant.getAddressMobilePhone());
        addressCreateAnAlias.sendKeys(shopingCartApplicant.getAddressAlias());

        submitAccountButtonId.click();
    }
}
