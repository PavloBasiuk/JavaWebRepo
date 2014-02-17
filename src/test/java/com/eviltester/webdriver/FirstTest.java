package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://btgkdev.cloudapp.net/");
        Assert.assertEquals("Title starts with 'GULLKYSTEN'", true, driver.getTitle().startsWith("GULLKYSTEN"));
        //Assert.assertEquals("Checking the title of home page", "GULLKYSTEN", driver.getTitle());
        driver.close();
        driver.quit();
    }
}
