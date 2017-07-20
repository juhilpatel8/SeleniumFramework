package com.barclaycardus.e2e.ui.pages;

import com.barclaycardus.e2e.utils.ReadProperties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Juhil on 3/27/2016.
 */
public abstract class ChannelsWebPage<T> {
    private static String BASE_URL;
    private static final int LOAD_TIMEOUT = 30;
    private static final int REFRESH_RATE = 2;

    protected WebDriver webDriver;

    public ChannelsWebPage() {
        webDriver = new SharedDriver();
    }

    static {
        try {
            BASE_URL = ReadProperties.init().getEnvironmentProperty("channels_base_url");
            System.out.println("URL trying ro hit :"+BASE_URL);
        } catch (Exception e) {
            Assert.fail("Failed to find env properties");
        }

    }

    public T openPage(Class<T> clazz) {
        T page = PageFactory.initElements(webDriver, clazz);
        if (null != getPageUrl()) {
            System.out.println("BASE URL:"+BASE_URL );
            webDriver.get(BASE_URL + getPageUrl());
        }
//        else
//        {
//            System.out.println("BASE URL:"+BASE_URL );
//            webDriver.get(BASE_URL);
//        }

        waitForPageToLoad(((ChannelsWebPage) page).getPageLoadSuccessElement());
        System.out.println("Waiting successsfully");
        return page;
    }

    private void waitForPageToLoad(String element) {
        try {
            System.out.println("Wait for page to load" + element);
            Wait wait = new FluentWait(webDriver).withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS).pollingEvery(REFRESH_RATE, TimeUnit.SECONDS);
            wait.until(isElementPresentJS(element));
        }
        catch(Exception ee)
        {
            ee.getStackTrace();
        }
    }

    private ExpectedCondition isElementPresentJS(final String element) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) webDriver).executeScript("return (null != document.getElementById('" + element + "'))");
            }
        };
    }

    protected abstract String getPageUrl();

    protected abstract String getPageLoadSuccessElement();
    public void waitForVisibilityOfElementById(String elementId)
    {
        Wait wait=new FluentWait(webDriver).withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS)
                .pollingEvery(REFRESH_RATE,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void waitForVisibilityOfElementByXpath(String elementXPath)
    {
        Wait wait=new FluentWait(webDriver).withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS)
                .pollingEvery(REFRESH_RATE,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    }

}
