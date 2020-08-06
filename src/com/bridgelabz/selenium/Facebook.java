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
}
