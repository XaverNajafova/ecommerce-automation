package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(path);

            spark.config().setReportName("E-Commerce Automation Report");
            spark.config().setDocumentTitle("Test Execution Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "Web Shop Automation");
            extent.setSystemInfo("Framework", "Selenium + TestNG");
            extent.setSystemInfo("QA", "Xaver");
        }

        return extent;
    }
}