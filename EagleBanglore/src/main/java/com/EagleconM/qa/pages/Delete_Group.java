package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Delete_Group extends Testbase {
	
	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;

	@FindBy(xpath = "//*[@class='btn btn-block btn-secondary manage_grp_btn']")
	WebElement Click_on_manage_button;
	@FindBy(xpath = "//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[1]/ul/li/div[2]/div[1]/button[3]/span/i")
	WebElement DeleteGroup;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/button[2] ")
	WebElement DeleteGroupd;

	
	
		
	
	public Delete_Group(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Deletegroup() throws InterruptedException{
		Clickonschedular.click();
		Thread.sleep(5000);
		Click_on_manage_button.click();
		Thread.sleep(5000);
		DeleteGroup.click();
		Thread.sleep(5000);
		DeleteGroupd.click();
		Thread.sleep(5000);
	}
	
	
	
}
