package com.eagle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver Idriver) {

		this.driver = Idriver;
	}

	@FindBy(name = "email")
	WebElement Username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "/html/body/div/div[2]/div/form/div[3]/div[2]/button")
	WebElement longmbtn;

	public void logintoEMB(String Usernameapp, String Passwordapp) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		Username.sendKeys(Usernameapp);
		password.sendKeys(Passwordapp);
		longmbtn.click();

	}

}
