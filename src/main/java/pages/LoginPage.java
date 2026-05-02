package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginLink = By.className("ico-login");
    By emailInput = By.id("Email");
    By passwordInput = By.id("Password");
    By loginButton = By.xpath("//input[@value='Log in']");

    public void openLoginPage() {
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(loginLink).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}