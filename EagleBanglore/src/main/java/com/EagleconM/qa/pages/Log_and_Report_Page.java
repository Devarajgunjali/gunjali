package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Log_and_Report_Page extends Testbase {

	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[5]/a")
	WebElement Click_on_button;

	@FindBy(xpath = "//*[@id='daterange-btn']")
	WebElement Date_range_button;
	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[1]")
	WebElement Today;
	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[2]")
	WebElement Yesterday;
	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[3]")
	WebElement last7daya;

	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[4]")
	WebElement Last30daya;

	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[5]")
	WebElement Thismonth;

	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[6]")
	WebElement lastmonth;

	public Log_and_Report_Page() {
		PageFactory.initElements(driver, this);
	}

	public void Logandreport() {
		Click_on_button.click();
	}

	public void today() throws Exception {
		Click_on_button.click();
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		Today.click();
	}

	public void yesterday() throws Exception {
		Click_on_button.click();
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		Yesterday.click();
	}

	public void last7day() throws Exception {
		Click_on_button.click();
		
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		last7daya.click();
	}

	public void Last30day() throws Exception {
		Click_on_button.click();
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		Last30daya.click();
	}

	public void Thismonth() throws Exception {
		Click_on_button.click();
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		Thismonth.click();
	}

	public void lastmonth() throws Exception {
		Click_on_button.click();
		Thread.sleep(5000);
		Date_range_button.click();
		Thread.sleep(5000);
		lastmonth.click();
	}

}
