package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Moderator_Passcode extends Testbase {

	@FindBy(xpath = "//*[@id='mod-pc-edit']")
	WebElement Moderator;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/button[2]")
	WebElement Moderator1;

	@FindBy(xpath = "//*[@id='part-pc-edit']")
	WebElement Participant;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/button[2]")
	WebElement Participant1;

	public Moderator_Passcode() {
		PageFactory.initElements(driver, this);

	}

	public void moderator() throws Exception {
		Moderator.click();
		Thread.sleep(5000);
		Moderator1.click();
		Thread.sleep(5000);

	}

	public void Participant1() throws Exception {
		Participant.click();
		Thread.sleep(5000);
		Participant1.click();
		Thread.sleep(5000);
	}

}
