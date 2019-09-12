package com.eagle.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.base.Testbase;

public class Homepage extends Testbase{
	
	@FindBy(xpath="//p[contains(text(),'Devaraj  Gunjali')]") 
	WebElement Username;
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") 
	WebElement Profilelink;
	

	@FindBy(xpath="//a[contains(text(),'Settings')]")
	WebElement Settingslink;
	
	
	@FindBy(xpath="//a[contains(text(),'Log & Report')]")
	WebElement LogReportlink;
	
	
	@FindBy(xpath="//a[contains(text(),'Billing')]")
	WebElement Billinglink;
	
	
	@FindBy(xpath="//a[contains(text(),'Support')]")
	WebElement supportlink;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	
	public Homepage(){
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean verifytheusernameTest(){
		return Username.isDisplayed();
	}
	
	public Profilepage  ClickonprofileTest(){
		Profilelink.click();
		
		return new Profilepage();
	}
	
	
	public Settingpage SettingpageTest(){
		Settingslink.click();
		return new Settingpage();
	}
	
	
	
	public Logandreportpage LogandreportpageTest(){
		LogReportlink.click();
		return new Logandreportpage();
	
	
	}
	
	public Billingpage BillingpageTest(){
		supportlink.click();
		return new Billingpage();
	
	}
	
	
	public Supportpage SupportpageTest(){
		Billinglink.click();
		return new Supportpage();
	}
	public Contactpage ContatTeart(){
		Billinglink.click();
		return new Contactpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
