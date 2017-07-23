package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juhil on 7/30/2016.
 */
public class CreateAnAccountPage extends ChannelsWebPage<CreateAnAccountPage> {

    @FindBy(id = "email_create")
    private WebElement emailId;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public CreateAnAccountPage init() {
        return openPage(CreateAnAccountPage.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        return "email_create";
    }

    public void CreateAnAccountPage(String emailAddress) throws Throwable {
        // ApplyButton.click();
        // return new LoanApplicationPge().init();
        Thread.sleep(2000);
        waitForVisibilityOfElementById("SubmitCreate");
        emailId.sendKeys(emailAddress);
        createAnAccountButton.click();
//        return new FillUpCreateAnAccountPage().init();
    }
}
