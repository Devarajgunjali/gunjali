package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class ForgotPassword extends Testbase {

	@FindBy(xpath = "/html/body/div/div[2]/div/form/div[3]/div[1]/a")
	WebElement Click_on_Forgotlink;
	@FindBy(name = "email")
	WebElement emil;

	@FindBy(xpath = "/html/body/div/div[2]/div/form/div[2]/div/button")
	WebElement sendbutton;

	public ForgotPassword() {
		PageFactory.initElements(driver, this);
	}

	public void forgot(String Ema) throws Exception   {
		Thread.sleep(5000);
		Click_on_Forgotlink.click();
		Thread.sleep(5000);
		emil.sendKeys(Ema);
		Thread.sleep(5000);
		sendbutton.click();
		Thread.sleep(5000);

	}

}
