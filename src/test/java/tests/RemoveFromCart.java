package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class RemoveFromCart extends BaseTest {

    @Test
    public void removeFromCartTest() {

        LoginPage loginPage = new LoginPage( getDriver());
        loginPage.openLoginPage();
        loginPage.login("najafovakhavar@gmail.com", "123456");

        getDriver().get("https://demowebshop.tricentis.com/books");

        getDriver().findElement(By.cssSelector("input[value='Add to cart']")).click();

        getDriver().findElement(By.className("cart-label")).click();

        getDriver().findElement(By.name("removefromcart")).click();
        getDriver().findElement(By.name("updatecart")).click();

        Assert.assertTrue( getDriver().getPageSource().contains("Your Shopping Cart is empty"));
    }
}