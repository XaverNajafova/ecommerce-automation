package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUser() {

        getDriver().get("https://demowebshop.tricentis.com/");

        getDriver().findElement(By.className("ico-register")).click();

       getDriver().findElement(By.id("gender-female")).click();
        getDriver().findElement(By.id("FirstName")).sendKeys("ALya");
        getDriver().findElement(By.id("LastName")).sendKeys("Najafli");
        getDriver().findElement(By.id("Email")).sendKeys("najafovakhavar@gmail.com");
        getDriver().findElement(By.id("Password")).sendKeys("123456");
        getDriver().findElement(By.id("ConfirmPassword")).sendKeys("123456");

        getDriver().findElement(By.id("register-button")).click();
    }
}