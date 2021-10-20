package com.buraksami.ProductPage;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {

    WebDriver driver;
    public ProductPage(WebDriver webDriver){
        driver=webDriver;


    }
    @Test
    public void sepeteEkle() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);

        driver.findElement(By.cssSelector("add-to-basket")).click();


    }
    @Test
    public void favoriEkle() throws InterruptedException {

       driver.findElement(By.cssSelector(".fv>.i-heart")).click();
        Thread.sleep(3000);


    }


}
