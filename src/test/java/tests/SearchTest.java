package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductTest() {

        driver.findElement(By.id("small-searchterms")).sendKeys("book");
        driver.findElement(By.cssSelector("input[value='Search']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
    }
}