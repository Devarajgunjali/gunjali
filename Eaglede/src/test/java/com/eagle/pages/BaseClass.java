package com.eagle.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.eagle.utility.BrowserFactry;
import com.eagle.utility.ConfigDataProvider;
import com.eagle.utility.ExcelDataProvider;
import com.eagle.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
//comment
	public ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() {
		Reporter.log(" Setting at the report and Test is geeting ready", true);
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();

		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/Reports/Eagleconferencing_" + Helper.getcurrentDateTime() + ".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		Reporter.log(" Setting done test can be start", true);
	}

	@BeforeClass
	public void setp() {
		Reporter.log(" Trying to start browser and application ready", true);
		driver = BrowserFactry.startApplication(driver, config.getBrowser(), config.getStringurl());// "https://portal.eagleconferencing.in/");
		Reporter.log(" Browser and application running up", true);
	}

	@AfterClass
	public void teardown() {
		BrowserFactry.quitbrowser(driver);
	}

	@AfterMethod

	public void teardownm(ITestResult result) throws IOException {
		Reporter.log(" Test is about end", true);
		if (result.getStatus() == ITestResult.FAILURE) {

			logger.fail("Test faild",MediaEntityBuilder.createScreenCaptureFromPath(Helper.ScreenShot(driver)).build());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(Helper.ScreenShot(driver)).build());

		}
		report.flush();
		Reporter.log(" Test Completed>>> Report generted", true);
	}

}
