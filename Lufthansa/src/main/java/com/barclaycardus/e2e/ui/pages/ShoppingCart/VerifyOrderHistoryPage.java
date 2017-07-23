package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juhil on 7/30/2016.
 */
public class VerifyOrderHistoryPage extends ChannelsWebPage<VerifyOrderHistoryPage> {


    @FindBy(xpath = "//*[@id='block-history']/p")
    private WebElement orderHistoryParagraph;

    public VerifyOrderHistoryPage init() {
        return openPage(VerifyOrderHistoryPage.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "//*[@id='block-history']/p";
    }

    public void viewOrderHistoryPage(String emailAddress) throws Throwable {

        waitForVisibilityOfElementByXpath("//*[@id='block-history']/p");
        Assert.assertEquals(orderHistoryParagraph.getText().toString(),"You have not placed any orders.");

    }
}
