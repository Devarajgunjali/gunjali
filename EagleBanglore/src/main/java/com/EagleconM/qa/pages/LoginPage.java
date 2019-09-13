package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class LoginPage extends Testbase {
	
	
	
	@FindBy(name="email")
	static
	WebElement Email;
	
	@FindBy(id="password")
	static
	WebElement Password;
	
	
	@FindBy(xpath="/html/body/div/div[2]/div/form/div[3]/div[2]/button")
	static
     WebElement loginbtn;
	
	@FindBy(xpath="/html/body/div/div[1]/a/img")
	static
	WebElement Logo;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	

	public static boolean Pagealogo(){
	return	Logo.isDisplayed();
	}
	
	
	public static HomePage login(String ur,String pw){
		
		Email.sendKeys(ur);
		Password.sendKeys(pw);
		
		loginbtn.click();
		
		return new HomePage();
	}
	
	
	
}
