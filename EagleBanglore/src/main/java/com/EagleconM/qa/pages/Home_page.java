package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Home_page extends Testbase{
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[1]/div[1]/h3/span")
	WebElement Account_Info;
	
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/input")
	WebElement Account_Number;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[1]/div[2]/div/div[3]/div/div/input")
	WebElement Current_Package;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input")
	WebElement Next_Billing_Date;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/input")
	WebElement Dial_In_Number;
	
	
	public Home_page(){
		PageFactory.initElements(driver, this);
	}
	public void Home_page() throws Exception{
	String str1=	Account_Info.getText();
	Thread.sleep(5000);
	System.out.println(str1);
	}
	public void Home_page1() throws Exception{
		String str2=	Account_Number.getText();
		Thread.sleep(5000);
		System.out.println(str2);
	}
	
	
	public void Home_page13() throws Exception{
		String str3=	Current_Package.getText();
		Thread.sleep(5000);
		System.out.println(str3);
	
	}
	public void Home_page14() throws Exception{
		String str4=	Next_Billing_Date.getText();
		Thread.sleep(5000);
		System.out.println(str4);
	}
	public void Home_page15() throws Exception{
		String str5=	Dial_In_Number.getText();
		Thread.sleep(5000);
		System.out.println(str5);
	

	}
}
