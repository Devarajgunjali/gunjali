package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Conference_invitation_both extends Testbase {

	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;

	@FindBy(xpath = "//*[@id='conf-invite-form']/div[1]/h3/span/label[3]")
	WebElement Webcon;

	@FindBy(name = "email_users_list")
	WebElement Email;

	@FindBy(id = "mail_subject")
	WebElement subject;

	@FindBy(id = "message1")
	WebElement message;

	@FindBy(xpath = "//*[@id='send-email-btn']")
	WebElement button;

	public Conference_invitation_both() {

		PageFactory.initElements(driver, this);

	}

	public void webcon(String email, String message1, String message2) throws Exception {
		Clickonschedular.click();
		Thread.sleep(5000);
		Webcon.click();

		Email.clear();
		Thread.sleep(5000);
		Email.sendKeys(email);
		Thread.sleep(5000);
		subject.clear();
		subject.sendKeys(message1);
		Thread.sleep(5000);
		message.clear();
		message.sendKeys(message2);
		Thread.sleep(5000);

		button.click();

	}

}
