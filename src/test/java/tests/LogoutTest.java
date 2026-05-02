package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("najafovakhavar@gmail.com", "123456");

        driver.findElement(By.className("ico-logout")).click();

        Assert.assertTrue(driver.findElement(By.className("ico-login")).isDisplayed());
    }
}