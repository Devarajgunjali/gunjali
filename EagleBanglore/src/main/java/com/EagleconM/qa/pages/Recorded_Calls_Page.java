package com.EagleconM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eagle.qa.base.Testbase;

public class Recorded_Calls_Page extends Testbase {
	
@FindBy(xpath="//*[@id='navbarCollapse']/ul/li[4]/a")
WebElement Recorder;


public Recorded_Calls_Page(){
	PageFactory.initElements(driver, this);
}
public void recoder() throws Exception {
	Thread.sleep(5000);
	Recorder.click();
}



}
