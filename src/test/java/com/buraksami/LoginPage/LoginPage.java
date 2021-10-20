package com.buraksami.LoginPage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;


    }

    @Test
    public void girisYap(){
        driver.findElement(By.id("login-email")).sendKeys("buraks4442@gmail.com");
        driver.findElement(By.id("login-password-input")).sendKeys("password123");
        driver.findElement(By.cssSelector("button.submit")).click();


    }
}



