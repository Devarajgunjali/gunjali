package com.eagle.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Home_page;
import com.EagleconM.qa.pages.LoginPage;

import com.eagle.qa.base.Testbase;

@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access", "static-access" })
public class Home_Information extends Testbase {
	Home_page home;
	LoginPage page;

	@BeforeMethod
	public void setup() {
		initiolization();

		page = new LoginPage();
		home = new Home_page();

		page.login(pro.getProperty("username"), pro.getProperty("password"));
	}

	@Test
	public void Account_Info() throws Exception {
		home.Home_page();
	}

	@Test
	public void Account_Number() throws Exception {
		home.Home_page1();
	}

	@Test
	public void Alternate_Account() throws Exception {
		home.Home_page13();
	}

	@Test
	public void Current_Package() throws Exception {
		home.Home_page14();
	}

	@Test
	public void Next_Billing_Date() throws Exception {
		home.Home_page15();
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
