package com.EagleconM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.eagle.qa.base.Testbase;

public class Email_Group extends Testbase {
	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;

	@FindBy(id = "mail_subject")
	WebElement subject;

	@FindBy(id = "message1")
	WebElement message;

	@FindBy(id = "send-email-btn")
	WebElement btn;

	public Email_Group() {
		PageFactory.initElements(driver, this);
	}

	public void Emailgroup(String subjectt, String messag) throws InterruptedException {
		Clickonschedular.click();
		Thread.sleep(5000);
		//Select drop = new Select(driver.findElement(By.xpath("//*[@id='conf-invite-form']/div[2]/div/div[2]/div[1]/div/span/span[1]/span ")));
		//drop.selectByVisibleText("Eagled");
		Thread.sleep(5000);
		subject.sendKeys(subjectt);
		Thread.sleep(5000);
		message.sendKeys(messag);
		Thread.sleep(5000);
		btn.click();
	}

}
