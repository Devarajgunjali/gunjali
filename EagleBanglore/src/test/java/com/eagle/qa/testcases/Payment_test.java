package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Payment_and_Billing_Page;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Payment_test extends Testbase {
	String sheetName = "Payment12";

	LoginPage login;
	Payment_and_Billing_Page payment;

	public Payment_test() {
		super();
	}

	@BeforeMethod
	public void Setup() {

		initiolization();

		login = new LoginPage();
		payment = new Payment_and_Billing_Page();
		login.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	/*
	 * @DataProvider public Object[][] getdatafromExcel(){ Object
	 * data[][]=Testutil.getTestData(sheetName); return data; }
	 * 
	 * @Test(dataProvider="getdatafromExcel") public void paymet(String
	 * InvoiceNumber, String Total_Bill_Amount,String Name,String
	 * Telephone,String Email,String Address,String City,String State,String
	 * Zip){ payment.Payment(InvoiceNumber, Total_Bill_Amount, Name, Telephone,
	 * Email, Address, City, State, Zip);
	 * 
	 * }
	 */

	@Test
	public void payment_page() throws Exception {

		/*
		 * Select drpo = new Select(driver.findElement(By.xpath(
		 * "//*[@id='billing_form']/div/div[2]/div[9]/div/div/span")));
		 * drpo.selectByValue("India");
		 */
		Thread.sleep(500);
		payment.Payment("123", "25", "Devaraj Gunjali", "9902938769", "raj@gmail.com", "ITpl", "Banglore", "Ka", "2019");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String text = driver
				.findElement(
						By.xpath("//*[@id='page-home']/div[1]/table[2]/tbody/tr/td/div[3]/table/tbody/tr[1]/th[2]"))
				.getText();
		System.out.println(text);
		Assert.assertEquals(text, ": Eagle Conferencing Pvt Ltd");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
