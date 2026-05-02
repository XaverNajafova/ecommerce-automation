package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUser() {

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("ALya");
        driver.findElement(By.id("LastName")).sendKeys("Najafli");
        driver.findElement(By.id("Email")).sendKeys("najafovakhavar@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        driver.findElement(By.id("register-button")).click();
    }
}