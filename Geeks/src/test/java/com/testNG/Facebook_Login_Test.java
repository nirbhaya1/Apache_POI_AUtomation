package com.testNG;

import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.geeks.Geeks.TecAdminSeleniumTest;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;




public class Facebook_Login_Test {

	String path = "/home/headrun/sample.xls";
	
	TecAdminSeleniumTest tecAdminSeleniumTest= new TecAdminSeleniumTest();
	//WebDriver driver= new ChromeDriver();
			
	@Test
	public void login() throws IOException
	{
//		tecAdminSeleniumTest.login();
		//tecAdminSeleniumTest.writeDataInExistingSheet(path, "sample", 1, 0, "Hello");
		
		tecAdminSeleniumTest.getExcelSheetData(path, path, 0, 0)
		//tecAdminSeleniumTest.createSheetAndWriteData(path, "sample", 1, 0, "Hello");
		System.out.println(tecAdminSeleniumTest.getExcelSheetData(path, "sample", 0, 0));		/*
		WebElement failed_login = driver.findElement(By.xpath("//div[@class='_9ay7']")); 
		System.out.println("Text of failed_login: " + failed_login.getText());		
		String x = failed_login.getText();
		String y = "The email address or mobile number you entered isn't connected to an account.";
		
		Assert.assertEquals(x,y);
		System.out.println("passed");
	
		
		*/
		
		
		
		
		
	}
	
	
}
