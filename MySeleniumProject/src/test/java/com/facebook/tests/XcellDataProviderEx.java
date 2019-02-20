package com.facebook.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class  XcellDataProviderEx {
	
	WebDriver driver;
	@BeforeSuite
	void preRequisite() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
    options.addArguments("start-maximized");		
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("This is Before Suite Method");
	driver.get("https://www.facebook.com/");
	}
	
	@DataProvider(name="FaceBookLoginData") //Data Provider for my FaceBook Test
	Object[][] provideData(){
		Object[][] dataSet = null;
		try {
		File file =new File("C:\\Users\\crist_000\\Desktop\\JAVASelenium core\\paramet.xlsx");
		FileInputStream input = new FileInputStream(file);//read data from file
		
		XSSFWorkbook book = new XSSFWorkbook(input);//for all xcel file
		XSSFSheet sheet = book.getSheet("Sheet1");//for sheet from xcel file
		
		int totalRows = sheet.getLastRowNum();
		int totalColumns = sheet.getRow(0).getLastCellNum();
		
		dataSet = new Object[totalRows][totalColumns];
		
		for(int iRow = 0; iRow <totalRows; iRow++) {
			for(int iCol = 0; iCol<totalColumns; iCol++) {
				String val = sheet.getRow(iRow+1).getCell(iCol).getStringCellValue();
				System.out.println(val);
				dataSet[iRow][iCol]=val;
			}
		}
	}catch(Exception e) {
		System.out.println("File not found!");
	}
		return dataSet;
	}
	

	@Test(enabled=true, dataProvider ="FaceBookLoginData")
	void enterFirstAndLastName(String fname, String lName) {
	WebElement firstName = 
	driver.findElement(By.xpath("//input[@name='firstname']"));
         firstName.sendKeys(fname);

    WebElement lastName =
    driver.findElement(By.xpath("//input[@name='lastname']"));
     lastName.sendKeys(lName);
     
     //Screenshots as well as Data Provider
     
     String path = "C:\\Users\\crist_000\\Desktop\\JAVASelenium core\\TestScreens\\";
     String finalPath = path + fname + ".png"; 
     File newFile = new File (finalPath);
     
     File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     try {
    	 FileUtils.copyFile(f,  newFile);
     }catch (IOException e) {
    	 System.out.println("No file found");
     }
     

     firstName.clear();
     lastName.clear();
}
}



