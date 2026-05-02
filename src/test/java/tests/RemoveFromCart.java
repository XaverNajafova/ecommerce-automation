package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class RemoveFromCart extends BaseTest {

    @Test
    public void removeFromCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("najafovakhavar@gmail.com", "123456");

        driver.get("https://demowebshop.tricentis.com/books");

        driver.findElement(By.cssSelector("input[value='Add to cart']")).click();

        driver.findElement(By.className("cart-label")).click();

        driver.findElement(By.name("removefromcart")).click();
        driver.findElement(By.name("updatecart")).click();

        Assert.assertTrue(driver.getPageSource().contains("Your Shopping Cart is empty"));
    }
}