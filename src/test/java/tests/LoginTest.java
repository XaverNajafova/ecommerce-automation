package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.openLoginPage();

        // ⚠️ BURDA REAL USER OLMALIDIR
        loginPage.login("najafovakhavar@gmail.com", "123456");

        // ✔ REAL CHECK
        boolean isLogoutVisible = getDriver().findElement(By.className("ico-logout")).isDisplayed();

        Assert.assertTrue(isLogoutVisible, "Login failed!");
    }
}