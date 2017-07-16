package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Juhil on 7/30/2016.
 */
public class SignInPage extends ChannelsWebPage<SignInPage> {

//    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Sign in" )
    private WebElement SignInLink;

    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public SignInPage init() {
        return openPage(SignInPage.class);
    }

    @Override
    protected String getPageUrl() {
        return null;
    }

    @Override
    protected String getPageLoadSuccessElement() {
        System.out.println("Able to loan element successfully");
        return "SignInLink";
    }

    public void SignInPage() {
        // ApplyButton.click();
        // return new LoanApplicationPge().init();
        System.out.println("Link Text:"+SignInLink.getText());
        SignInLink.click();
    }
}
