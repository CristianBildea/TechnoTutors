package com.kijiji.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kijiji.pages.PetsModul;

public class TestPets {
	
WebDriver driver;
	
	@BeforeSuite
	void preRequisites() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
	    options.addArguments("start-maximized");		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("https://www.kijiji.ca/");
	}

	@BeforeMethod
      public void pets(){
	  PetsModul ps = PageFactory.initElements(driver,PetsModul.class);
	  ps.clickPets();
	}
	
  @Test
   void testPetsmodul() {
	  
	  PetsModul ps = PageFactory.initElements(driver,PetsModul.class);
	 // ps.clickPets();
	  ps.clickAccesso();
	  ps.fishClick();
	  
	  
  }
  
 // @Test
  //void testdogmodul() {
	  
	  //PetsModul ps = PageFactory.initElements(driver,PetsModul.class);
	  //ps.clickPets();
	  //ps.clickAccesso();
	  
	 // ps.clicckdog();
  
  
}
