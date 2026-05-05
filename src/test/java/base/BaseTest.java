package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import utils.ExtentManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.getReport();
    }

    @BeforeMethod
    public void setUp(Method method) {

        test = extent.createTest(method.getName());

        String browser = System.getProperty("browser", "chrome");

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);

            test.log(Status.INFO, "Browser started: Chrome");

        }
        else if (browser.equalsIgnoreCase("edge")) {

            test.log(Status.SKIP, "Edge browser disabled in CI");
            throw new SkipException("Edge browser is disabled");

        }
        else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            String path = ScreenshotUtil.takeScreenshot(driver, result.getName());

            test.log(Status.FAIL, "Test Failed: " + result.getName());
            test.addScreenCaptureFromPath(path);

        }
        else if (result.getStatus() == ITestResult.SUCCESS) {

            test.log(Status.PASS, "Test Passed: " + result.getName());

        }
        else if (result.getStatus() == ITestResult.SKIP) {

            test.log(Status.SKIP, "Test Skipped: " + result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }
}