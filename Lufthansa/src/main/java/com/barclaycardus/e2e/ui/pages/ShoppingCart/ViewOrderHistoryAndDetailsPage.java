package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juhil on 7/30/2016.
 */
public class ViewOrderHistoryAndDetailsPage extends ChannelsWebPage<ViewOrderHistoryAndDetailsPage> {

    //   //a[text()='text_i_want_to_find']/@href
    @FindBy(xpath = "//span[text()='Order history and details']")
    private WebElement orderHistoryAndDetails;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
    private WebElement orderHistoryAndDetailsHyperLink;


    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public ViewOrderHistoryAndDetailsPage init() {
        return openPage(ViewOrderHistoryAndDetailsPage.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "//span[text()='Order history and details']";
    }

    public void viewOrderHistoryAndDetailsPage(String emailAddress) throws Throwable {

        waitForVisibilityOfElementByXpath("//span[text()='Order history and details']");
        System.out.println("Completed Journey Successfully");
        orderHistoryAndDetailsHyperLink.click();

    }
}
