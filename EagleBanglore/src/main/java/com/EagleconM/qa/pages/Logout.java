package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Logout extends Testbase{
	
	
	
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/a/span/i")
	WebElement Click_logout;
	
	
	

	
	public Logout(){
		PageFactory.initElements(driver, this);
	}
	
	public void Logout(){
		Click_logout.click();
		
		
		
	}
	
	
}
