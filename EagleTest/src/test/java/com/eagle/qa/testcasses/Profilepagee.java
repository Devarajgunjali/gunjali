package com.eagle.qa.testcasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eagle.base.Testbase;
import com.eagle.qa.pages.Homepage;
import com.eagle.qa.pages.Loginpage;
import com.eagle.qa.pages.Profilepage;


public class Profilepagee extends Testbase{
	
	Loginpage loginpage;
	Homepage homepage;
	Profilepage profilepage;
	
	public Profilepagee(){
		super();
		
		}
	
	@BeforeMethod
	public void setup(){
		initiolization();
		loginpage = new Loginpage();
		profilepage = new Profilepage();
		homepage  =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Test
	public void changepass(){
	
		profilepage.creatnewpassword("Testnig1", "testing1", "testing1");
	}
	
	
	
	
	
	
@AfterMethod
public void Teardown(){
	driver.close();
}
}
