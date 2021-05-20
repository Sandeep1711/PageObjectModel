package com.crm.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.util.TestUtil;
import com.google.gson.annotations.SerializedName;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest extends TestBase {
	DashboardPage dashboardPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		try {
			initialization();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dashboardPage = new DashboardPage();
		homePage = new HomePage();
		
	}
	
	
	@Test(priority=1,description = "Verify presence of Women tab")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case description : Verify presence of Women tab")
	@Story("Story Name: To check pressence of Women tab")
	public void verifyWomenTabTest(){
		boolean exp = homePage.verifyWomentab();
		Assert.assertTrue(exp);
	}
	
	
	@Test(priority=2,description = "Verify presence of Dress tab")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test case description : Verify presence of Dress tab")
	@Story("Story Name: To check pressence of Dress tab")
	public void verifyDressTabTest(){
		boolean exp = homePage.verifydresstab();
		Assert.assertTrue(exp);
	}
	
	@Test(priority=3,description = "Verify presence of Tshirt tab")
	@Severity(SeverityLevel.MINOR)
	@Description("Test case description : Verify presence of TShirt tab")
	@Story("Story Name: To check pressence of TShirt tab")
	public void verifyTshirtTabTest(){
		boolean exp = homePage.verifyTshirttab();
		Assert.assertTrue(exp);
	}
	
	@AfterMethod
	public void endMethod()
	{
		driver.quit();
	}

}
