package com.barclaycardus.e2e.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juhil on 7/30/2016.
 */
public class LoanApplicationPge extends ChannelsWebPage<LoanApplicationPge> {

    @FindBy(id = "loanValue")
    private WebElement loanAmountValue;
    @FindBy(id = "loanType")
    private WebElement loanPurpose;
    @FindBy(id = "/html/body/div[4]/div/div/div/div[1]/input")
    private WebElement ApplyButton;

    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public LoanApplicationPge init() {
        return openPage(LoanApplicationPge.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "loanType";
    }

    public LoanApplicationPge LoanCalculatorPage() {
        // ApplyButton.click();
        // return new LoanApplicationPge().init();
        return null;
    }
}
