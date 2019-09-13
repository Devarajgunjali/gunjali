package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Web_Conferrncing_invitation;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Conference_both extends Testbase {
	LoginPage page;
	Web_Conferrncing_invitation webconf;
	String sheetName = "Audioconfernci";

	@BeforeMethod
	public void setup() {
		initiolization();
		page = new LoginPage();
		webconf = new Web_Conferrncing_invitation();
		page.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getdata")
	public void WebConference__invitation_both(String Email, String Subject, String Message) {

		webconf.webcon(Email, Subject, Message);
		String str = driver.findElement(By.xpath("//*[@id='conf-invite-form']/div[1]/h3/span/label[3] ")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Both");
	}

	@AfterMethod
	public void Teardown() {
	driver.quit();
	}

}
