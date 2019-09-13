package com.eagle.qa.testcases;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Logout;
import com.eagle.qa.base.Testbase;

public class Log_out extends Testbase {
	LoginPage page;
	Logout Logout1;

	@BeforeMethod

	public void Setup() {
		initiolization();

		page = new LoginPage();
		Logout1 = new Logout();

		page.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test
	public void Logout_Successful() throws Exception {
		Logout1.Logout();
		Thread.sleep(5000);
	Alert alert =	driver.switchTo().alert();
	alert.accept();
	
	String str =driver.getCurrentUrl();
	System.out.println(str);
	
	Assert.assertEquals(str,"https://portal.eagleconferencing.in/login");
		
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
