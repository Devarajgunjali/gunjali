package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Conference_Invitation_page;
import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Aoudio_conference extends Testbase {
	String sheetName = "Audioconfernci";
	LoginPage loginpage;
	Conference_Invitation_page confer;

	@BeforeMethod
	public void setup() {
		initiolization();
		loginpage = new LoginPage();
		confer = new Conference_Invitation_page();
		loginpage.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getdata")
	public void Confer_Invitation(String Email, String Subject, String Message) throws InterruptedException {
		confer.Invitation_page(Email, Subject, Message);
		// confer.Invitation_page("dev@eagleconferencing.in");

		String str = driver.findElement(By.xpath("//*[@id='conf-invite-form']/div[1]/h3/span/label[1] ")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Audio Conference");

	}

	@AfterMethod
	public void reardown() {
		//driver.quit();
	}

}
