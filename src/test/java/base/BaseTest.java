package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
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

        } else if (browser.equalsIgnoreCase("edge")) {

            try {
                WebDriverManager.edgedriver()
                        .clearResolutionCache()
                        .setup();

                EdgeOptions options = new EdgeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--remote-allow-origins=*");

                driver = new EdgeDriver(options);

            } catch (Exception e) {
                throw new RuntimeException(
                        "EdgeDriver failed. Check internet/DNS or WebDriverManager config: " + e.getMessage()
                );
            }

        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        System.out.println("Running on browser: " + browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}