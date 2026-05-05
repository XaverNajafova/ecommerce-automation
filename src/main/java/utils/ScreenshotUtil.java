package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String testName) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + "/test-output/screenshots/"
                + testName + ".png";

        File destination = new File(path);

        try {
            Files.createDirectories(destination.getParentFile().toPath());
            Files.copy(src.toPath(), destination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }
}