package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Payment_and_Billing_Page extends Testbase {

	@FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[6]/a/span")
	WebElement Click_on_payment;

	@FindBy(name = "reference_no")
	WebElement Invoice_Number;

	@FindBy(name = "amount")
	WebElement Amount;

	@FindBy(name = "name")
	WebElement Name;

	@FindBy(name = "phone")
	WebElement phoneNumber;

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(name = "address")
	WebElement address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postal_code")
	WebElement Postal_code;

	@FindBy(id = "select2-country-xd-container")
	WebElement drop;

	
	@FindBy(id = "pay_btn")
	WebElement Makepaymentbutton;
	
	
	
	public Payment_and_Billing_Page() {
		PageFactory.initElements(driver, this);
	}

	public void Payment(String InvoiceNumber, String amount, String names, String Phonenumber, String Emils,
			String Adre, String city, String stste, String post) throws Exception {
		Thread.sleep(500);
		Click_on_payment.click();
		Invoice_Number.clear();

		Invoice_Number.sendKeys(InvoiceNumber);
		Thread.sleep(500);
		Amount.clear();
		Amount.sendKeys(amount);
		Thread.sleep(500);
		Name.clear();
		Name.sendKeys(names);
		Thread.sleep(500);
		phoneNumber.clear();
		phoneNumber.sendKeys(Phonenumber);
		Thread.sleep(500);
		Email.clear();
		Email.sendKeys(Emils);
		Thread.sleep(500);
		address.clear();
		address.sendKeys(Adre);
		Thread.sleep(500);
		City.clear();
		City.sendKeys(city);
		Thread.sleep(500);
		State.clear();
		State.sendKeys(stste);
		Thread.sleep(500);
		Postal_code.clear();
		Postal_code.sendKeys(post);
		Thread.sleep(500);
		
		Makepaymentbutton.click();

	}

}
