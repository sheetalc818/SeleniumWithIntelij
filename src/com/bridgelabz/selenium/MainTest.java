package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MainTest extends BaseTest
{
    @Test(description = "Test to upload file", priority = 2)
    public void test() throws InterruptedException
    {
        driver.get("https://html.com/input-type-file/");
        Reporter.log("===Website Opened===", true);
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        WebElement upload = driver.findElement(By.name("fileupload"));
        upload.sendKeys("/home/sheetal/Downloads/employee-information-form-download-20170810.pdf");
        //driver.findElement(By.name("fileupload")).sendKeys("/home/sheetal/Downloads/employee-information-form-download-20170810.pdf");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void test1(){
        driver.get("https://www.facebook.com");
        WebElement Email;
        Email=driver.findElement(By.id("email"));
        Email.sendKeys("sheetalc818@gmail.com");
        WebElement login;
        login=driver.findElement(By.id("loginbutton"));
        login.click();
//        WebElement radio;
//        radio=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
//        radio.click();
    }
}
