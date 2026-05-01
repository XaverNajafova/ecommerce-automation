package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProductAddToCart = By.xpath("(//input[@value='Add to cart'])[1]");
    By cartLink = By.className("cart-label");

    public void addFirstProductToCart() {

        WaitUtils.getWait(driver).until(
                d -> d.findElements(firstProductAddToCart).size() > 0
        );

        driver.findElement(firstProductAddToCart).click();
    }

    public void openCart() {

        WaitUtils.getWait(driver).until(
                d -> d.findElement(cartLink).isDisplayed()
        );

        driver.findElement(cartLink).click();
    }
}