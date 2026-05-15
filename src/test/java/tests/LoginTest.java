package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.lang.Thread;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.openLoginPage();


        loginPage.login("najafovakhavar@gmail.com", "123456");
        Thread.sleep(1500);

        boolean isLogoutVisible = getDriver().findElement(By.className("ico-logout")).isDisplayed();

        Assert.assertTrue(isLogoutVisible, "Login failed!");
        Thread.sleep(1500);
    }
}