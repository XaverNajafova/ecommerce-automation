package tests;

import config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.openqa.selenium.By;


public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() {

        LoginPage loginPage = new LoginPage(driver);
        ConfigReader config = new ConfigReader();

        // login
        loginPage.openLoginPage();
        loginPage.login(config.getUsername(), config.getPassword());

        // product add to cart
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();

        // go to cart
        driver.findElement(By.className("ico-cart")).click();

        // verification
        boolean isProductVisible = driver.getPageSource().contains("Build your own computer");
        Assert.assertTrue(isProductVisible);
    }
}