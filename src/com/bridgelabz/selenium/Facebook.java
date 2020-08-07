package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Facebook extends BaseTest
{
    @Test
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
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]"));
        Thread.sleep(5000);
        WebElement popup = driver.findElement(By.xpath("//label[contains(text(),'Login with Phone')]"));
        popup.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testingtestdatablz@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://blz.capsulecrm.com/login");
        Thread.sleep(5000);
        driver.findElement(By.id("login:usernameDecorate:username")).sendKeys("sheetalbdz");
        Thread.sleep(5000);
        driver.findElement(By.id("login:passwordDecorate:password")).sendKeys("Premanshu8");
        Thread.sleep(5000);
        driver.findElement(By.id("login:login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("select-box-el-31")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ember37")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("select-box-el-44")).click();
        Thread.sleep(5000);
        //driver.findElement(By.id("select-box-el-71")).click();
        driver.findElement(By.id("select-box-el-72")).click();
        Thread.sleep(5000);
    }
}
