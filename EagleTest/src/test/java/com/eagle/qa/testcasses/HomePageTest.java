package com.eagle.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eagle.base.Testbase;
import com.eagle.qa.pages.Homepage;
import com.eagle.qa.pages.Loginpage;
import com.eagle.qa.pages.Profilepage;

public class HomePageTest extends Testbase{
	Loginpage loginpage;
	Homepage homepage;
	Profilepage profilepage;
	
	public HomePageTest(){
		super();
		
		}
	
	@BeforeMethod
	public void setup(){
		initiolization();
		loginpage = new Loginpage();
		profilepage = new Profilepage();
		homepage  =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyUsername(){
	boolean homepagee=	homepage.verifytheusernameTest();
    System.out.println(homepagee);
	Assert.assertEquals(homepagee, true);
		
	}
@Test(priority=2)
	public void ProfilepageTest(){
	profilepage =homepage.ClickonprofileTest();
		
	}
	
	@AfterMethod
	public void Teardown(){
		driver.close();
	
	}
}
