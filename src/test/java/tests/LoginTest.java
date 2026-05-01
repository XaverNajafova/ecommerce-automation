package tests;

import base.BaseTest;
import config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        // 🔥 report test start
        test = extent.createTest("Login Test");

        try {

            LoginPage loginPage = new LoginPage(driver);
            ConfigReader config = new ConfigReader();

            loginPage.openLoginPage();
            loginPage.login(config.getUsername(), config.getPassword());

            String title = driver.getTitle();

            Assert.assertTrue(title.contains("Demo Web Shop"));

            // ✔ success log
            test.pass("Login successful. Title verified: " + title);

        } catch (Exception e) {

            // ❌ fail log
            test.fail("Login test failed: " + e.getMessage());

            throw e;
        }
    }
}