package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Log_out extends Testbase{
	
	
	
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/a/span/i")
	WebElement Click_logout;
	
	
	

	
	public Log_out(){
		PageFactory.initElements(driver, this);
	}
	
	public void Logout() throws InterruptedException{
		Thread.sleep(5000);
		Click_logout.click();
		
		
		
	}
	
	
}
