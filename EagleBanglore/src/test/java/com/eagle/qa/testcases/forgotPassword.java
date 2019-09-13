package com.eagle.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.ForgotPassword;
import com.EagleconM.qa.pages.LoginPage;

import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class forgotPassword extends Testbase {
	ForgotPassword  forgot1;
	LoginPage page;
String sheetName="Forgotpassword";
	public forgotPassword() {
		super();
	}

	@BeforeMethod

	public void Setup() {
		initiolization();

		page = new LoginPage();
		forgot1 = new ForgotPassword();
		

	}
	@DataProvider
	public Object[][] getdata(){
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void forgot_Password(String emails) throws Exception{
		forgot1.forgot(emails);
		
	}
@AfterMethod
public void Teardown(){
	driver.quit();
}
}
