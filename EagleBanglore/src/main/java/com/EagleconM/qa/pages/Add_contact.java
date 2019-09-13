package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Add_contact extends Testbase {

	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[3]/a")
	WebElement Clickonschedular;

	@FindBy(xpath = "//*[@class='btn btn-block btn-secondary manage_grp_btn']")
	WebElement Click_on_manage_button;

	@FindBy(xpath = "//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[3]/ul/li/div[2]/div[1]/button[1]/span/i")
	WebElement Click_on_edite;
	@FindBy(name = "contact_name")
	WebElement ContactName;
	@FindBy(name = "contact_email")
	WebElement Email;

	
	@FindBy(xpath="//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[3]/div/div/ul/li[2]/div/div[4]/div/button[1]")
	WebElement savebtton;
	@FindBy(xpath="//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[3]/div/div/ul/li[2]/div/div[4]/div/button[2]")
	
	WebElement deletd;
	
	@FindBy(xpath="//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[3]/div/div/ul/li[3]/div/div[4]/div[1]/button[2]")
	WebElement deletd2;
	
	
	
	public Add_contact(){
		PageFactory.initElements(driver, this);
	}
	
	public void  add_contact(String namen,String Emails) throws InterruptedException{
		Clickonschedular.click();
		Thread.sleep(5000);
		Click_on_manage_button.click();
		Thread.sleep(5000);
		Click_on_edite.click();
		Thread.sleep(5000);
		
		ContactName.sendKeys(namen);
		Thread.sleep(5000);
		
		Email.sendKeys(Emails);
		Thread.sleep(5000);
		
		savebtton.click();
		Thread.sleep(5000);
		
	}
	
	
	
	public void deletedsuccesuful() throws InterruptedException{
		
		Clickonschedular.click();
		Thread.sleep(5000);
		Click_on_manage_button.click();
		Thread.sleep(5000);
		Click_on_edite.click();
		Thread.sleep(5000);
		deletd.click();
		
	}
	
	
	public void DeleteContacta() throws InterruptedException{
		Clickonschedular.click();
		Thread.sleep(5000);
		Click_on_manage_button.click();
		Thread.sleep(5000);
		Click_on_edite.click();
		Thread.sleep(5000);
		deletd.click();
		Thread.sleep(5000);
		deletd2.click();
		
	}
	
	
	
	
	
	
	
}
