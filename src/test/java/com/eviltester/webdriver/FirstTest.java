package com.eviltester.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://btgkdev.cloudapp.net/");
        //Assert.assertTrue("Title should be", "GULLKYSTEN"==driver.getTitle() );
        Assert.assertEquals("Checking the title of home page", "GULLKYSTEN", driver.getTitle());
    }
}
