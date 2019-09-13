package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class RegistrationPage extends Testbase {

	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/a")
	WebElement Registerlink;

	@FindBy(xpath = "//*[@id='first_name']")
	WebElement FirtName;

	@FindBy(xpath = "//*[@id='last_name']")
	WebElement LastName;

	@FindBy(xpath = "//*[@id='mobile']")
	WebElement mobileNumber;

	public RegistrationPage() {

		PageFactory.initElements(driver, this);
	}

	public void Register(String name, String lastname, String Mobilenumber) {

		Registerlink.click();

		FirtName.sendKeys(name);
		LastName.sendKeys(lastname);
		mobileNumber.sendKeys(Mobilenumber);
	}

}
