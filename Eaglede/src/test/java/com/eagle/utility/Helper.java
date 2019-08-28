package com.eagle.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static String ScreenShot(WebDriver driver) {
		
		
		
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String ScreenShotpath = System.getProperty("user.dir")+"/Screenshots/Eagleconferencing_"+getcurrentDateTime()+".png";
	try{
	FileHandler.copy(src, new File(ScreenShotpath));
	
	System.out.println("screentshot captured ");
	}catch(Exception e){
		System.out.println("Unable to take screenshot");
	}
	return ScreenShotpath;

	}
	
	
	public static String getcurrentDateTime(){
		
		
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customformat.format(currentdate);
	}

}
