package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Change_Password_page;
import com.EagleconM.qa.pages.HomePage;
import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Change_Passwordtest extends Testbase {
	LoginPage loginpage;
	HomePage page;
	Change_Password_page pass;
	String sheetName="Password";
	
	public Change_Passwordtest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
	  pass = new Change_Password_page ();
		loginpage = new LoginPage();
		loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
		
	}
	@DataProvider
	public Object[][] getDatafromecel(){
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}
	
	
	
	
	
	@Test(dataProvider="getDatafromecel")
	public void Changepassword_successfuily(String old,String newpass,String confirm) throws InterruptedException{
		
		//pass.changepassword("Testing1", "Testing1", "Testing1");
		pass.changepassword(old, newpass, confirm);
		
		Thread.sleep(500);
		
		 
		
		//String str = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/p")).getText();
	//System.out.println(str);
		/*if(str.equals("Password Changed Successfully!")){
			System.out.println("Password Changed Successfully:Test passed");
		}
		else{
			System.out.println("Password Changed UnSuccessfully");
		}*/
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void Teardown(){
		driver.quit();
	}

}
