package base;

import com.aventstack.extentreports.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import utils.ExtentManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

    // Thread-safe WebDriver
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Thread-safe ExtentTest
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    protected static ExtentReports extent;

    // Getter methods
    public WebDriver getDriver() {
        return driver.get();
    }

    public ExtentTest getTest() {
        return test.get();
    }

    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.getReport();
    }

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser, Method method) {

        // Create test for report (thread-safe)
        test.set(extent.createTest(method.getName()));

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");

            driver.set(new ChromeDriver(options));

            getTest().log(Status.INFO, "Browser started: Chrome");

        } else if (browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();

            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");

            driver.set(new EdgeDriver(options));

            getTest().log(Status.INFO, "Browser started: Edge");

        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            String path = ScreenshotUtil.takeScreenshot(getDriver(), result.getName());

            getTest().fail("Test Failed: " + result.getName());
            getTest().addScreenCaptureFromPath(path);

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            getTest().pass("Test Passed: " + result.getName());

        } else if (result.getStatus() == ITestResult.SKIP) {

            getTest().skip("Test Skipped: " + result.getName());
        }

        // Quit driver safely
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // IMPORTANT for parallel
        }
    }

    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }
}