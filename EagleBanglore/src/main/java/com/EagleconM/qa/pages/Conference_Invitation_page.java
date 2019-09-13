package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Conference_Invitation_page extends Testbase {
	
	
	
	
	@FindBy(xpath="//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement schedularLink;
	
	@FindBy(xpath="//*[@id='conf-invite-form']/div[1]/h3/span/label[1]")
	WebElement Audioconfernce;
	
	@FindBy(name="email_users_list")
	WebElement Toemail;
	
	@FindBy(id="mail_subject")
	WebElement subject;
	
	@FindBy(name="message1")
	WebElement message;
	
	
	@FindBy(xpath="//*[@id='send-email-btn']")
	WebElement btn;
	
	
	
	
	public Conference_Invitation_page(){
		PageFactory.initElements(driver, this);
	}
	
	public  void Invitation_page(String Email,String Subject,String message1) throws InterruptedException{
		schedularLink.click();
		Thread.sleep(5000);
		
		Audioconfernce.click();
		
		Thread.sleep(5000);
		Toemail.sendKeys(Email);
		Thread.sleep(5000);
		subject.clear();
		subject.sendKeys(Subject);
		Thread.sleep(5000);
		message.sendKeys(message1);
		
		Thread.sleep(5000);
		btn.click();
		
		
		}
	

}
