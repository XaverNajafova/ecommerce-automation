package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("najafovakhavar@gmail.com", "123456");

        driver.get("https://demowebshop.tricentis.com/books");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//input[@value='Add to cart'])[1]")
        )).click();
    }
}