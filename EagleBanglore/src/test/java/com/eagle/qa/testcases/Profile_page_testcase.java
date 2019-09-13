package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.HomePage;
import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Profile_page_testcase extends Testbase {

	LoginPage loginpage;
	HomePage homePage;
	String sheetName = "Profile";

	public Profile_page_testcase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
		loginpage = new LoginPage();
		homePage = new HomePage();
		homePage = loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
	}

	@DataProvider
	public Object[][] gettestdataEagle() {
		Object data[][] = Testutil.getTestData(sheetName);
		return data;

	}

	@Test(dataProvider = "gettestdataEagle")
	public void Update_and_edite_Profile(String FirstName, String LastName, String MobileNumber, String Address,
			String City, String State, String Country, String PINCode) throws Exception {
		homePage.FilltheDate(FirstName, LastName, MobileNumber, Address, City, State, Country, PINCode);
		// String message =
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/p")).getText();
		// System.out.println(message);
		// Assert.assertEquals(message, "Profile updated successfully.");
	}

	/*
	 * @Test public void UpdateandediteProfile() throws InterruptedException{
	 * homePage.FilltheDate("ftname", "Ltnam", "Adss", "cty", "sts", "cntr",
	 * "pn", "mbl"); }
	 */

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
