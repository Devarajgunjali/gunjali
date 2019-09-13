package com.eagle.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EagleconM.qa.pages.LoginPage;
import com.EagleconM.qa.pages.Manage_Group;
import com.eagle.qa.base.Testbase;
import com.eagle.qa.util.Testutil;

public class Create_Group extends Testbase{
	 Manage_Group mange;
	LoginPage page;
	String sheetName ="Create_Group";
	@BeforeMethod
	public void setup(){
		initiolization();
		page = new LoginPage();
		mange = new  Manage_Group();
		page.login(pro.getProperty("username"), pro.getProperty("password"));


	}
	
	@DataProvider
	public Object[][] getdata(){
		Object data [][]=Testutil.getTestData(sheetName);
		return data;
	}

	
	@Test(dataProvider="getdata")
	public void Create_Groups(String groupName) throws InterruptedException{
		mange.Creategroup(groupName);
		
	///String str =	driver.findElement(By.xpath("//*[@id='manageEmailGroupModal']/div/div/div[2]/div[1]")).getText();
	//	System.out.println(str);}
	}
	@Test(priority=2)
	public void delete(){
		driver.findElement(By.xpath("//*[@id='manageEmailGroupModal']/div/div/div[2]/div[3]/div[3]/ul/li/div[2]/div[1]/button[3]/span/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button[2]")).click();
		
	}
	
	
	@AfterMethod
	public void tear(){
		driver.quit();
	}
	
}
