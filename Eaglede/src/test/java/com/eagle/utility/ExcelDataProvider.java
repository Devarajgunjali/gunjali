package com.eagle.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataProvider {
	XSSFWorkbook web;

	public  ExcelDataProvider() {

		File src = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);

			web = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read excel file" + e.getMessage());
		}
	}

	public String getStringData(int SheetIndex, int row, int colum) {
		return web.getSheetAt(SheetIndex).getRow(row).getCell(colum).getStringCellValue();

	}

	public String getStringData(String Sheetname, int row, int colum) {
		return web.getSheet(Sheetname).getRow(row).getCell(colum).getStringCellValue();

	}

	public double getnumericData(String Sheetname, int row, int colum) {
		return web.getSheet(Sheetname).getRow(row).getCell(colum).getNumericCellValue();

	}
}
