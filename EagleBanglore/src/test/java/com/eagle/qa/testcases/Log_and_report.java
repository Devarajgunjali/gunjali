package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Log_and_Report_Page;
import com.EagleconM.qa.pages.LoginPage;

import com.eagle.qa.base.Testbase;

public class Log_and_report extends Testbase {

	LoginPage login;
	Log_and_Report_Page logandreport;

	public Log_and_report() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
		login = new LoginPage();
		logandreport = new Log_and_Report_Page();
		login.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test
	public void Log_and_Report() throws InterruptedException {

		logandreport.Logandreport();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='daterange-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[7]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/input")).sendKeys("09/05/2019");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[6]/td[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[6]/td[5]")).click();
		Thread.sleep(5000);
		String str = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]/span"))
				.getText();
		Thread.sleep(5000);
		System.out.println(str);
		Assert.assertEquals(str, "September 5 2019");
		String str1 = driver.findElement(By.xpath("//*[@id='total_callers']/span")).getText();
		System.out.println("Total Unique Callers_" + str1);
		Assert.assertEquals(str1, "2");

		String str3 = driver.findElement(By.xpath("//*[@id='total_minutes']")).getText();
		System.out.println("Total Minutes_" + str3);
		Assert.assertEquals(str3, "5");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='log-report-table']/tbody/tr/td[2]/span")).click();
		Thread.sleep(5000);
		String str4 = driver.findElement(By.xpath("//*[@id='detailModal']/div/div/div[1]/h3")).getText();
		System.out.println(str4);
		Thread.sleep(5000);
		Assert.assertEquals(str4, "Participant Details");
		driver.findElement(By.xpath("//*[@id='detailModal']/div/div/div[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='download_reports']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[2]/button/i")).click();

	}

	@Test
	public void today_Report() throws Exception {
		logandreport.today();
	String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
	System.out.println(str);
		
		//Assert.assertEquals(str, "Report for Today (September 09 2019)");
	}
	
	@Test
	public void yestrday_report() throws Exception {
		logandreport.yesterday();
	String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
	System.out.println(str);
	}

	@Test
	public void last7day_Report() throws Exception {
		logandreport.last7day();
		String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Report for Last 7 Days");
	}

	@Test
	public void last30day_Report() throws Exception {
		logandreport.Last30day();
		String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
		System.out.println(str);
		//Assert.assertEquals(str, "Report for Last 30 Days");
	}

	@Test
	public void thismonth_Report() throws Exception {
		logandreport.Thismonth();
		String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
		
		System.out.println(str);
		Assert.assertEquals(str, "Report for Last 30 Days");
		
	}

	@Test
	public void lastmonth_Report() throws Exception {
		logandreport.lastmonth();
		String str =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div/div[1]/h3/div[1]/div[1]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Report for Last Month");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
