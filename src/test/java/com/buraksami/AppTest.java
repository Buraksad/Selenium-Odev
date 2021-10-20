package com.buraksami;

import static org.junit.Assert.assertTrue;

import com.buraksami.LoginPage.LoginPage;
import com.buraksami.MainPage.MainTest;
import com.buraksami.ProductPage.ProductPage;
import com.buraksami.SearchPage.SearchPage;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.annotation.Target;


public class AppTest {

    WebDriver driver;





    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");



    }

    @Test
        public void tests() throws InterruptedException {

        MainTest mainTest = new MainTest(driver);
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductPage productPage = new ProductPage(driver);


        mainTest.testGender();
        mainTest.redirectLogin();
        loginPage.girisYap();
        searchPage.aramaKutusu();
        searchPage.getElement();
        productPage.sepeteEkle();
        productPage.favoriEkle();


    }

}
