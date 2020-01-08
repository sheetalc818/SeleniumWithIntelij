package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MainTest extends BaseTest
{
    @Test
    public void test() throws InterruptedException
    {
        driver.get("https://html.com/input-type-file/");
        Reporter.log("===Website Opened===", true);
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        driver.findElement(By.name("fileupload")).sendKeys("/home/sheetal/Downloads/employee-information-form-download-20170810.pdf");
        Thread.sleep(2000);
    }
}
