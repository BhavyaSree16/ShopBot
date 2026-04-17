package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = BaseTest.getDriver(); 

        if (driver != null) {
            String testName = result.getName();
            ScreenshotUtil.captureScreenshot(driver, testName);
            System.out.println("Screenshot captured for failed test: " + testName);
        } else {
            System.out.println("Driver is null, screenshot not captured");
        }
    }
}