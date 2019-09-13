package com.eagle.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;

public class Login_page extends Testbase {
	LoginPage loginpage;

	public Login_page() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initiolization();

		loginpage = new LoginPage();

	}

	@Test
	public void Login_Successfuly() {
		loginpage.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
