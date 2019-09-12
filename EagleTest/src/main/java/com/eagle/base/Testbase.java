package com.eagle.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.eagle.qa.utility.Testbaseutility;

public class Testbase {
	
	public static WebDriver driver;
    public static Properties prop;
	
	
	public Testbase(){
		
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/EagleTest/src/main/java/com/eagle/qa/config/config.properties");
			prop.load(ip);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
				}
    
	public static void initiolization(){
    	 String browsername = prop.getProperty("browser");
    	 if( browsername.equals("firefox")){
    		 System.setProperty("webdriver.gecko.driver","E:/geckodriver/geckodriver.exe");
      		  
      		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
      	    capabilities.setCapability("marionette", true);
      	  driver = new FirefoxDriver(capabilities);
    		
    	 }
    	 else if(browsername.equals("chrome")){
    		
   		System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
    		 
    	 }
    	 //driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Testbaseutility.IMPLICIT_WAIT, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(Testbaseutility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    	 driver.manage().deleteAllCookies();
    	 driver.get(prop.getProperty("url"));
     }
}
