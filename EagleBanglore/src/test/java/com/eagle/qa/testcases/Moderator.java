package com.eagle.qa.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Moderator_Passcode;
import com.eagle.qa.base.Testbase;

public class Moderator extends Testbase {
	LoginPage page;
	Moderator_Passcode moderator1;
	public Moderator(){
		super();
	}

	@BeforeMethod

	public void Setup() {
		initiolization();

		page = new LoginPage();
		moderator1 = new Moderator_Passcode();

		page.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test
	public void Morderotor() throws Exception {
		Thread.sleep(5000);
		moderator1.moderator();
		
	
		
	
	}

	@Test
	public void Participant_Passcode() throws Exception {
		Thread.sleep(5000);
		moderator1.Participant1();
	}

	@AfterMethod
	public void terdown() {
		driver.quit();
	}

}
