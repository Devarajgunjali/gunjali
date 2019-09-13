package com.eagle.qa.util;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.eagle.qa.base.Testbase;

public class Testutil extends Testbase {
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH = "C:/EagleBanglore/src/main/java/com/eagle/qa/testdata/eagleconferenicng.xlsx";
	public static long PAGE_LOAD_TIME_OUT = 20;
	public static long IMPLICT_WAIT_TIME_OUT = 20;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;

	}


	
	
	
	
	
	/*public static  string takeScreenshotAtEndOfTest() throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		String ScreenShotpath =	FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.ge + ".png"));
		retun ScreenShotpath1;*/

	

public static String takeScreenshotAtEndOfTest() {
	
	
	
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String ScreenShotpath = System.getProperty("user.dir")+"/Screenshots/Eagleconferencing_"+getcurrentDateTime1()+".png";
	try{
	FileHandler.copy(src, new File(ScreenShotpath));
	
	System.out.println("screentshot captured ");
	}catch(Exception e){
		System.out.println("Unable to take screenshot");
	}
	return ScreenShotpath;

	}
	
	
	public static String getcurrentDateTime1(){
		
		
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customformat.format(currentdate);
	}

}














