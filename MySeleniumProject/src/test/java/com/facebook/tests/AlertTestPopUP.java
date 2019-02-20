package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertTestPopUP {
	
	WebDriver driver;
	
  @Test
  public void testAlertPopUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
	    options.addArguments("start-maximized");		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("This is Before Suite Method");
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("Selenium");
		
		driver.findElement(By.name("submit")).click();
		
		Alert popUp = driver.switchTo().alert();// Alert is class si driver.switchTo is a method si im da object for the class
		System.out.println(popUp.getText());
		
		System.out.println("alertMessage");
		popUp.accept();//method
		
		//popUp.dismiss();
		
  }
}
