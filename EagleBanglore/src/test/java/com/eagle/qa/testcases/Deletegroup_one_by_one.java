package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.Add_contact;
import com.EagleconM.qa.pages.Delete_Group;
import com.EagleconM.qa.pages.LoginPage;
import com.eagle.qa.base.Testbase;

public class Deletegroup_one_by_one extends Testbase {

	LoginPage login;
	Add_contact addcontacts;
	String sheetName = "Contatcts";
	Delete_Group delete;

	public Deletegroup_one_by_one() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiolization();
		login = new LoginPage();
		delete = new Delete_Group();
		login.login(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test
	public void Groupdelete_successfuly() throws InterruptedException {
		delete.Deletegroup();

		String str = driver.findElement(By.xpath("//h3[@class='modal-title']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Manage Email Group");
	}
	
	@Test
	public void Groupdelete2_successfuly() throws InterruptedException {
		delete.Deletegroup();

		String str = driver.findElement(By.xpath("//h3[@class='modal-title']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Manage Email Group");
	}
	
	@Test
	public void Groupdelete3_successfuly() throws InterruptedException {
		delete.Deletegroup();

		String str = driver.findElement(By.xpath("//h3[@class='modal-title']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Manage Email Group");
	}
	@Test
	public void Groupdelete4_successfuly() throws InterruptedException {
		delete.Deletegroup();

		String str = driver.findElement(By.xpath("//h3[@class='modal-title']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Manage Email Group");
	}
	
	
	
	
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
