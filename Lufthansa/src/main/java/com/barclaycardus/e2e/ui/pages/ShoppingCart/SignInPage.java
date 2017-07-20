package com.barclaycardus.e2e.ui.pages.ShoppingCart;

import com.barclaycardus.e2e.ui.pages.ChannelsWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Juhil on 7/30/2016.
 */
public class SignInPage extends ChannelsWebPage<SignInPage> {

//    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")

    // originl xpath=  "//*[@id='contact-link']/a"
  //how to write in Framework  @FindBy(xpath = "//*[@id=\"contact-link\"]/a")

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement SignInLink;

    //*[@id="global-header"]/ul/li[5]/div/input
//*[@id="global-header"]/ul/li[5]/div/input
    public SignInPage init() {
        return openPage(SignInPage.class);
    }

    //First page url can not be null ; so please add something here
    @Override
    protected String getPageUrl() {
        return "index.php";
    }

    @Override
    protected String getPageLoadSuccessElement() {
        System.out.println("Able to load element successfully");
        return "SignInLink";
    }

    public CreateAnAccountPage SignInPage() throws Throwable{
        System.out.println("Link Text:"+SignInLink.getText());
        SignInLink.click();
        return new CreateAnAccountPage().init();
    }
}
