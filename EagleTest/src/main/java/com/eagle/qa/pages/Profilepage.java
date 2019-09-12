 package com.eagle.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.base.Testbase;

public class Profilepage extends Testbase{
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") 
	WebElement Profilelink;
	@FindBy(id="old_password")
	WebElement oldpassword;
	
  @FindBy(id="new_password")
  WebElement newpassword;
  @FindBy(id="confirm_password")
  WebElement confirmpassword;
  
  @FindBy(xpath="//button[contains(text(),'Save')")
  WebElement save;
	
	public Profilepage(){
		PageFactory.initElements(driver, this);
		
		
	}
	public boolean verifytheprofilepage(){
	return Profilelink.isDisplayed();
	}
	
	public void creatnewpassword(String old, String newp,String confirm){
		oldpassword.sendKeys(old);
		newpassword.sendKeys(newp);
		confirmpassword.sendKeys(confirm);
		save.click();
		
	}
}