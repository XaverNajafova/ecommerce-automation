package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser = System.getProperty("browser", "chrome");

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);

            System.out.println("Running on browser: chrome");

        }
        else if (browser.equalsIgnoreCase("edge")) {

            // EDGE DISABLED FOR CI STABILITY
            System.out.println("Edge tests are disabled. Skipping execution.");

            throw new SkipException("Edge browser is disabled in this framework");

        }
        else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}