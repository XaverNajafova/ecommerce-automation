package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import base.BaseTest;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        // 1. login
        loginPage.openLoginPage();
        loginPage.login("test@example.com", "123456");

        // 2. product page
        driver.get("https://demowebshop.tricentis.com/books");

        // 3. add to cart
        productsPage.addFirstProductToCart();
        productsPage.openCart();

        // 4. assertion
        Assert.assertTrue(driver.getPageSource().contains("Shopping cart"));
    }
}