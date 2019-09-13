package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class HomePage extends Testbase {

	@FindBy(xpath = "//*[@id='prof-edit']")
	WebElement Welcome;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[1]/div[1]/input")
	WebElement FirtName;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[1]/div[2]/input")
	WebElement LastName;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[2]/div[1]/input")
	WebElement mobileNumber;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[3]/div/input")
	WebElement Addres;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[4]/div[1]/input")
	WebElement city;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[4]/div[2]/input")
	WebElement state;

	@FindBy(xpath = "//*[@id='prof-form']/div/div[5]/div[1]/input")
	WebElement country;

	@FindBy(xpath = "//*[@id='pin']")
	WebElement pin;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-red float-right']")
	WebElement savabtn;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void FilltheDate(String ftname, String Ltnam, String mbl, String Adss, String cty, String sts, String cntr,
			String pn) throws InterruptedException {
		Welcome.click();
		FirtName.clear();
		FirtName.sendKeys(ftname);
		Thread.sleep(5000);
		LastName.clear();
		LastName.sendKeys(Ltnam);
		Thread.sleep(5000);
		mobileNumber.clear();
		mobileNumber.sendKeys(mbl);
		Thread.sleep(5000);
		Addres.clear();
		Addres.sendKeys(Adss);
		Thread.sleep(5000);
		city.clear();
		city.sendKeys(cty);
		Thread.sleep(5000);
		state.clear();
		state.sendKeys(sts);
		Thread.sleep(5000);
		country.clear();
		country.sendKeys(cntr);
		Thread.sleep(5000);
		pin.clear();
		pin.sendKeys(pn);
		Thread.sleep(5000);
		savabtn.click();
		Thread.sleep(5000);

	}

}