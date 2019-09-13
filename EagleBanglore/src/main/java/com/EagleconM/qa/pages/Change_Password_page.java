package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Change_Password_page extends Testbase{
	
	
	
	
	@FindBy(id="reset-psw")
	WebElement Change;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/button[2]")
	WebElement okbutton;
	
	
	@FindBy(name="old_password")
	WebElement OldPassword;
	
	
	@FindBy(name="new_password")
	WebElement NewPassword
;
	
	@FindBy(name="conf_password")
	WebElement ConfirmPassword;
	@FindBy(xpath="html/body/div[2]/div/div/div/div/p")
	WebElement succes;
	
	
	public Change_Password_page(){
		PageFactory.initElements(driver, this);
	}
	
	public  void changepassword(String oldpass,String newpass,String confirm) throws InterruptedException{
		Change.click();
		Thread.sleep(500);
		okbutton.click();
		Thread.sleep(500);
		
		
		OldPassword.sendKeys(oldpass);
		Thread.sleep(500);
		NewPassword.sendKeys(newpass);
		Thread.sleep(500);
		ConfirmPassword.sendKeys(confirm);
		Thread.sleep(500);
		
		
	/*String str=	succes.getText();
	System.out.println(str);*/
		
}
	

}	
