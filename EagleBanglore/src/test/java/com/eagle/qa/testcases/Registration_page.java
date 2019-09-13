package com.eagle.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.RegistrationPage;
import com.eagle.qa.base.Testbase;

public class Registration_page extends Testbase {
	RegistrationPage reg;

	public Registration_page() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();

		reg = new RegistrationPage();
	}

	@Test
	public void Registratin() {
		reg.Register("Devaraj", "Gunjali", "9902938799");
	}

	@AfterMethod
	public void TearDown() {
		 driver.quit();
	}

}