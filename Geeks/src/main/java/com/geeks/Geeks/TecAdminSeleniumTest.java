package com.geeks.Geeks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TecAdminSeleniumTest {

	// WebDriver driver= new ChromeDriver();

	// xls format
	public void createSheetAndWriteData(String excelSheetPath, String sheetName, int row, int cell, String data) {
		File path = new File(excelSheetPath);
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet(sheetName);
		sheet.createRow(row).createCell(cell).setCellValue(data);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			workbook.write(fos);
			fos.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	

	public void writeDataInExistingSheet(String path, String sheetName, int row, int cell, String data) throws IOException
	{
		File src = new File(path);
		FileInputStream fis = new FileInputStream(path);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		sheet.getRow(row).getCell(cell).setCellValue(data);
		fis.close();
		try {
			FileOutputStream fos = new FileOutputStream(src);
			workbook.write(fos);
			fos.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param path Provide the xls format sheet"/home/headrun/sample.xls"
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 */
	public String getExcelSheetData(String path, String sheetName, int row, int cell) {
		File src = new File(path);
		String data = null;
		try {
		FileInputStream fs = new FileInputStream(src);
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		data=  sheet.getRow(row).getCell(cell).getStringCellValue();
		
		}
		catch(
			Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
	
public String getExcelTwoDimData(String path, String sheetName)
{
	File src = new File(path);
	FileInputStream fs = new FileInputStream(src);
	HSSFWorkbook workbook = new HSSFWorkbook(fs);
	HSSFSheet sheet = workbook.getSheet(sheetName);
	for(i=1;i<=)
	return sheetName;
	
}
	
	

	public TecAdminSeleniumTest() {
		// System.setProperty("webdriver.chrome.driver", "/usr/bin/");
		// driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
	}

	public void openFacebook() {

	}

	public void login() throws IOException {

		// String actualtitle = driver.getTitle();

		// Read excel file using POI

		File src = new File("/home/headrun/sample.xls");

		/*
		 * FileInputStream fs = new FileInputStream("/home/headrun/sample.xlsx");
		 * XSSFWorkbook workbook = new XSSFWorkbook(fs); XSSFSheet ws =
		 * workbook.getSheet("Movies"); String value =
		 * ws.getRow(1).getCell(1).getStringCellValue(); String value2 =
		 * ws.getRow(2).getCell(0).getStringCellValue(); System.out.println(value2);
		 * 
		 */

		/*
		 * 
		 * XSSFWorkbook workbook = new XSSFWorkbook(); XSSFSheet sheet =
		 * workbook.createSheet("sample");
		 * sheet.createRow(4).createCell(4).setCellValue("Sachin");
		 */

		FileInputStream fs = new FileInputStream("/home/headrun/sample.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		// HSSFSheet sheet = workbook.createSheet("sample");
		HSSFSheet sheet = workbook.getSheet("sample");
		sheet.getRow(5).getCell(0).setCellValue("9");
		// sheet.createRow(10).createCell(2).setCellValue("sachin");
		fs.close();
		// sheet.createRow(8).createCell(2).setCellValue("monit");
		// sheet2.createRow(1).createCell(1).setCellValue("xyz");
		try {
			FileOutputStream fos = new FileOutputStream(src);
			workbook.write(fos);
			fos.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/*
		 * for(int i=1;i<=ws.getLastRowNum();i++) {
		 * 
		 * 
		 * //Email XSSFCell cell = ws.getRow(i).getCell(0);
		 * //cell.setCellType(Cell.CELL_TYPE_STRING); WebElement
		 * txtmailid=driver.findElement(By.xpath("//input[@id='email']"));
		 * txtmailid.sendKeys(cell.getStringCellValue());
		 * 
		 * //Password XSSFCell cell2 = ws.getRow(i).getCell(1); WebElement
		 * txtpass=driver.findElement(By.xpath("//input[@id='pass']"));
		 * txtpass.sendKeys(cell2.getStringCellValue());
		 * 
		 * 
		 * //login WebElement logBtn=driver.findElement(By.
		 * xpath("(//button[normalize-space()='Log in'])[1]")); logBtn.click();
		 * 
		 * //Write Data FileOutputStream fos = new FileOutputStream(src); String message
		 * = "Fail"; ws.getRow(i).createCell(2).setCellValue(message);
		 * workbook.write(fos);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		/*
		 * WebElement txtmailid=driver.findElement(By.xpath("//input[@id='email']"));
		 * txtmailid.sendKeys("balanajdnj");
		 * 
		 * WebElement txtpass=driver.findElement(By.xpath("//input[@id='pass']"));
		 * txtpass.sendKeys("123");
		 * 
		 * WebElement logBtn=driver.findElement(By.
		 * xpath("(//button[normalize-space()='Log in'])[1]")); logBtn.click();
		 * 
		 */

	}

}
