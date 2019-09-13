

package com.eagle.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.eagle.qa.util.Testutil;
import com.eagle.qa.util.WebEventListener;

public class Testbase {

	public static WebDriver driver;
	public static Properties pro;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistner;

	public Testbase() {

		pro = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:/EagleBanglore/src/main/java/com/qa/config/config.properties");

			pro.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initiolization() {

		String browserName = pro.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/dell/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/dell/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:/Users/dell/Downloads/IEDriverServer_x64_2.48.0/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else {
			System.out.println("Broswer is not availble in this project");
		}

		e_driver = new EventFiringWebDriver(driver);
		eventlistner = new WebEventListener();

		e_driver.register(eventlistner);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICT_WAIT_TIME_OUT, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));

	}

}
