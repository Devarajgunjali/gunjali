package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Manage_Group extends Testbase {
	
	@FindBy(xpath="//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;
	
	@FindBy(xpath="//*[@id='conf-invite-form']/div[2]/div/div[2]/div[2]/div")
	WebElement clickonmanage;
	
	
	@FindBy(xpath="//*[@id='manageEmailGroupModal']/div/div/div[2]/div[2]/button")
	WebElement creatgroup;
	
	
	@FindBy(xpath="//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[1]/ul/li/div[1]/input")
	WebElement save;
	
	@FindBy(xpath="//*[@id='group-save-btn']")
	WebElement savebtn;
	
	
	public Manage_Group(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void Creategroup(String GrouName) throws InterruptedException{
		Thread.sleep(5000);
		Clickonschedular.click();
		Thread.sleep(5000);
		clickonmanage.click();
		Thread.sleep(5000);
		creatgroup.click();
		Thread.sleep(5000);
		save.sendKeys(GrouName);
		Thread.sleep(5000);
		savebtn.click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
	}
	
	
}


