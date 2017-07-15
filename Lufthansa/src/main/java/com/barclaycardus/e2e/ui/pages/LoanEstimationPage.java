package com.barclaycardus.e2e.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Juhil on 4/16/2016.
 */
public class LoanEstimationPage extends ChannelsWebPage<LoanEstimationPage> {


//    @FindBy(id="loanValue")
//    private WebElement loanAmountValue;
//    //*[@id="loanType"]
//    @FindBy(xpath="//*[@id=\"pgTitle\"]/div[2]/div[2]/div/div[3]")
//    private WebElement loanPurpose;
//
//    @FindBy(id="profile")
//    private WebElement creditEstimation;
//
//    @FindBy(id="estimate")
//    private WebElement estimateButton;

    //*[@id="global-nav"]/ul/li[8]/input
    @FindBy(xpath="//*[@id=\"global-nav\"]/ul/li[8]/input")
    private WebElement estimateButton;

    public LoanEstimationPage init()
    {

        return openPage(LoanEstimationPage.class);
    }

    @Override
    protected String getPageUrl() {
        return "/personal-loans/";
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "//*[@id=\"global-nav\"]/ul/li[8]/input";
    }
////*[@id="pgTitle"]/div[2]/div[2]/div
    public LoanCalculatorPage startwithConsumerLoans(String loanAmount) throws InterruptedException {
        waitForVisibilityOfElementByXpath("//*[@id=\"global-nav\"]/ul/li[8]/input");
//        loanAmountValue.sendKeys(loanAmount);
//        Select selectLoanType=new Select(loanPurpose).c;
//        selectLoanType.selectByVisibleText("Debt Consolidation");
//       // selectLoanType.selectByIndex(2);
//        Select selectProfile=new Select(creditEstimation);
//        selectProfile.selectByIndex(2);
        estimateButton.click();
        return new LoanCalculatorPage().init();
    }

}
