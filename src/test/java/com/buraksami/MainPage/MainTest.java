package com.buraksami.MainPage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MainTest {

    WebDriver driver;
    public MainTest(WebDriver webDriver){
        driver=webDriver;


    }




    @Test
    public void testGender(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.cssSelector("img[src='https://cdn.dsmcdn.com/web/production/gender-popup-male.png']")).click();


    }

    @Test
    public void redirectLogin (){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("div.user-login-container"))).perform();
        driver.findElement(By.cssSelector("div.login-button")).click();


    }


}
