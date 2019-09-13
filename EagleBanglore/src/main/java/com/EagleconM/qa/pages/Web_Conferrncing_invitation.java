package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Web_Conferrncing_invitation extends Testbase {
	
	
	
	@FindBy(xpath="//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;
	

	@FindBy(xpath = "//*[@id='conf-invite-form']/div[1]/h3/span/label[2]")
	WebElement Webcon;

	@FindBy(name = "email_users_list")
	WebElement Email;

	@FindBy(id = "mail_subject")
	WebElement subject;

	@FindBy(id = "message1")
	WebElement message;
	@FindBy(xpath = "//*[@id='send-email-btn']")
	WebElement button;
	public Web_Conferrncing_invitation() {

		PageFactory.initElements(driver, this);

	}

	public void webcon(String email, String message1,String message2) {
		Clickonschedular.click();
		Webcon.click();

		Email.clear();
		Email.sendKeys(email);
		subject.clear();
		subject.sendKeys(message1);
		message.clear();
		message.sendKeys(message2);
		
		button.click();
		
		
		

	}

}