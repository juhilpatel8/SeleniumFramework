package com.barclaycardus.e2e.ui.pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.omg.SendingContext.RunTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.barclaycardus.e2e.utils.ReadProperties;

import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Juhil on 3/27/2016.
 */
public class SharedDriver extends EventFiringWebDriver {
    private static WebDriver REAL_DRIVER;
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            REAL_DRIVER.quit();
        }
    };

    static {
        REAL_DRIVER = getRealDriver();
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    public SharedDriver() {
        super(REAL_DRIVER);
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException("You should nt close thiswebdriver.It is shared and will" + "close when JVM exists");
        }
        super.close();
    }

    @Before
    public void deleteAllCookies() {
        manage().deleteAllCookies();
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    private static WebDriver getRealDriver() {
        if (System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            return new ChromeDriver();
        } else if (System.getProperties().getProperty("os.name").toLowerCase().contains("mac")) {
            return new ChromeDriver();
        } else {
            return getFirefoxDriver();
        }
    }

    private static FirefoxDriver getFirefoxDriver() {
        setFirefoxPathinSystemProperties();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference(FirefoxProfile.ALLOWED_HOSTS_PREFERENCE, getHostName() + "," + "localhost.localdomain,localhost");
        profile.setAcceptUntrustedCertificates(true);
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, profile);
        FirefoxDriver firefoxDriver = new FirefoxDriver(cap);
        firefoxDriver.getWindowHandle();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        firefoxDriver.manage().window().maximize();

        return firefoxDriver;
    }


    private static void setFirefoxPathinSystemProperties() {
        if (System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.firefox.bin", ReadProperties.getApplicationProperty("firefox_path_windows"));
        } else if (System.getProperties().getProperty("os.name").toLowerCase().contains("linux")) {
            System.setProperty("webdriver.firefox.bin", ReadProperties.getApplicationProperty("firefox_path_linux"));
        } else {
            System.setProperty("webdriver.firefox.bin", ReadProperties.getApplicationProperty("firefox_path_osx"));
        }

    }

    private static String getHostName() {
        String hostname=null;
        try
        {
            hostname=java.net.InetAddress.getLocalHost().getHostName();
        }
        catch (UnknownHostException ee)
        {
            ee.printStackTrace();
            System.exit(1);
        }
        return hostname;
    }


}