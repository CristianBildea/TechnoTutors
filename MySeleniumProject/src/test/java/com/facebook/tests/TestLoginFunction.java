package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

public class TestLoginFunction {
	
	WebDriver driver;
	
	@BeforeSuite
	void preRequisites() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
	    options.addArguments("start-maximized");		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}
		
	
  @Test
   void testFaceBookLogin() {
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			  
			  loginPage.enterUserName("cristibildea@yahoo.com");
	          loginPage.enterPassword("123344");
	          loginPage.clickLogin();
  }
}
