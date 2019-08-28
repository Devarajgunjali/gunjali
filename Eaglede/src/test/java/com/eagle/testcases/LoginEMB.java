package com.eagle.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.eagle.pages.BaseClass;
import com.eagle.pages.Loginpage;
import com.eagle.utility.ExcelDataProvider;

public class LoginEMB extends BaseClass {
	

	@Test
	public void Loginstartapplication() {
		
	logger=	report.createTest("Login to eagleconferencing");
		
		excel.getStringData("Login", 0, 0);

		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		logger.info("Starting Application");
		loginpage.logintoEMB(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
       logger.pass("Login done successfully");
	}

}
