package com.weborders.tests.login;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.TestBase;
import org.testng.annotations.Test;

import static com.weborders.utilities.BrowserUtils.waitForPageToLoad;

public class LoginTest extends TestBase {
    @Test
    public void testLoggin() throws InterruptedException {

        extentLogger = report.createTest("Sales manager Log In Performance");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailMan"),
                ConfigurationReader.getProperty("passwordMan"));
        waitForPageToLoad(8000);

    }

}
