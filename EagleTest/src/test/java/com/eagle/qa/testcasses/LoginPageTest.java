package com.eagle.qa.testcasses;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eagle.base.Testbase;
import com.eagle.qa.pages.Homepage;
import com.eagle.qa.pages.Loginpage;

public class LoginPageTest extends Testbase{
	
	Loginpage loginpage;
	Homepage homepage;
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setup(){
		initiolization();
		
 loginpage = new Loginpage();
 
 
	}
	
	
	@Test(priority=1)
	public void loginpagetest(){
	String title=loginpage.validatelognpageTitle();
	Assert.assertEquals(title, "Tunnel | Login");
	System.out.println(title);
		
	}
	@Test(priority=2)
	public void tunnellogo(){
		boolean flag =loginpage.validateimpage();
		System.out.println(flag);
		
	}
	@Test(priority=3)
	public void loginpage(){
	homepage  =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tear(){
	driver.close();
	
	}
}
