package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginLink = By.className("ico-login");
    By email = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.cssSelector("input[value='Log in']");

    public void openLoginPage() {

        WaitUtils.getWait(driver).until(
                d -> d.findElement(loginLink).isDisplayed()
        );

        driver.findElement(loginLink).click();
    }

    public void login(String user, String pass) {
        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}