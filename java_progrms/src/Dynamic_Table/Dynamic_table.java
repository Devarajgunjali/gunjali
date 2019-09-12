package Dynamic_Table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {

public static void main(String args[]){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:/Users/dell/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String row = "//*[@id='leftcontainer']/table/tbody/tr";
	int rowdata = driver.findElements(By.xpath(row)).size();
	System.out.println(rowdata);
	
	String col = "//*[@id='leftcontainer']/table/tbody/tr[1]/td";
	int coldata = driver.findElements(By.xpath(col)).size();
	System.out.println(coldata);
	String Firstxpath = "//*[@id='leftcontainer']/table/tbody/tr[";
	String secondxpath ="]/td[";
	String thirdxpath ="]";
	for(int i=1;i<=rowdata;i++){
		for(int j=1;j<=coldata;j++){
		String finalxptha = Firstxpath+i+secondxpath+j+thirdxpath;
		//System.out.println(finalxptha);
			String text = driver.findElement(By.xpath(finalxptha)).getText();
			
			System.out.print(text+" | ");
		}
		System.out.println();
	}
	
}

}
