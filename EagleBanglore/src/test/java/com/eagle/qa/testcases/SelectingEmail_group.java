package com.eagle.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Email_Group;
import com.EagleconM.qa.pages.LoginPage;

import com.eagle.qa.base.Testbase;

public class SelectingEmail_group extends Testbase {
	
	Email_Group emails;

		LoginPage page;
		String sheetName ="Create_Group";
		@BeforeMethod
		public void setup(){
			initiolization();
			 emails = new Email_Group();
			page = new LoginPage();
			page.login(pro.getProperty("username"), pro.getProperty("password"));


		}
		
		@Test
		public void Select_drop_Email_group() throws InterruptedException{
			emails.Emailgroup("subjectt", "messag");
			
		}
		
		@AfterMethod
		public void tearbrowser(){
			driver.quit();
		}
		

}
