package com.eagle.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.base.Testbase;

public class Loginpage extends Testbase {
	
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginsubmit;

	@FindBy(xpath="//img[@class='img-responsive center-block']")
	WebElement logotunnel;
	
	@FindBy(xpath="//button[@class='btn blk-btn btn-block'")
	WebElement signup;

public Loginpage(){
	PageFactory.initElements(driver, this);
	
}

public String validatelognpageTitle(){
return	driver.getTitle();
}

public boolean validateimpage(){
	return logotunnel.isDisplayed();
}
public Homepage login(String ur,String paw){
	
	username.sendKeys(ur);
	password.sendKeys(paw);
	loginsubmit.click();
	return new Homepage();
}




}