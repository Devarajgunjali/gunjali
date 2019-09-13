package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Add_contact;
import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Recorded_Calls_Page;
import com.eagle.qa.base.Testbase;

public class RecorderTestcase extends Testbase {
	Recorded_Calls_Page recorder;
	LoginPage login;
	Add_contact addcontacts;
	String sheetName = "Contatcts";

	public RecorderTestcase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
		login = new LoginPage();
		recorder = new Recorded_Calls_Page();
		login.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test
	public void Recorder() throws Exception {
		recorder.recoder();

		String text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/label[1]")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		Select drop = new Select (driver.findElement(By.xpath("//*[@id='recording-table_length']/label/select")));
		drop.selectByIndex(1);
		Thread.sleep(5000);
 		Assert.assertEquals(text, "Conf. Recordings In Your Account");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
