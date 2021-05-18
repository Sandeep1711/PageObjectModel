package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;
import com.crm.qa.pages.DashboardPage;


public class DashboardPageTest extends TestBase {
	DashboardPage dashboardPage;
	HomePage homePage;
	TestUtil util;
	public ExtentReports extent;
	

	public DashboardPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		try {
			initialization();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dashboardPage = new DashboardPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		boolean flag = dashboardPage.validatepresencesearchbox();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void crmLogoImageTest() {
		boolean flag = dashboardPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void endMethod()
	{
		driver.quit();
	}
	
	
}
