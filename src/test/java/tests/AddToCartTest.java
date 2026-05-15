package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.lang.Thread;
import pages.LoginPage;
import java.time.Duration;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() throws InterruptedException {

        LoginPage loginPage = new LoginPage( getDriver());
        loginPage.openLoginPage();
        Thread.sleep(1500);
        loginPage.login("najafovakhavar@gmail.com", "123456");

        getDriver().get("https://demowebshop.tricentis.com/books");
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//input[@value='Add to cart'])[1]")
        )).click();
        Thread.sleep(2000);
    }
}