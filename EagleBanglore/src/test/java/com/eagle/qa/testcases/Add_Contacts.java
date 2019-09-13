package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Add_contact;
import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Add_Contacts extends Testbase {

	LoginPage login;
	Add_contact addcontacts;
	String sheetName = "Contatcts";

	public Add_Contacts() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
		login = new LoginPage();
		addcontacts = new Add_contact();
		login.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getdata")
	public void Add_Contacts(String Namess, String Emailss) throws InterruptedException {

		addcontacts.add_contact(Namess, Emailss);

	}

	/*
	 * @Test(priority = 2) public void cancelbutton() throws
	 * InterruptedException { addcontacts.deletedsuccesuful(); }
	 * 
	 * @Test(priority = 3) public void Deletecontacts() throws
	 * InterruptedException { addcontacts.DeleteContacta(); }
	 * 
	 * @AfterMethod public void TearDown() { driver.quit(); }
	 */
}
