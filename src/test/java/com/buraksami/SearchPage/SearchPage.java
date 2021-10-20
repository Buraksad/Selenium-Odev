package com.buraksami.SearchPage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class SearchPage {

    WebDriver driver;
    public SearchPage(WebDriver webDriver){
        driver=webDriver;


    }

    @Test
    public void aramaKutusu(){
        WebElement element = driver.findElement(By.cssSelector("input.search-box"));
        element.sendKeys("kazak");
        element.sendKeys(Keys.ENTER);


    }

    @Test
    public void getElement () throws InterruptedException {


        WebElement product = driver.findElement(By.xpath("(//div[@class='image-overlay-body']//img)[10]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(product).click().build().perform();
        product.click();

        String currentWindows = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!currentWindows.equals(windows)) {
                driver.switchTo().window(windows);
            }
        }



    }
}
