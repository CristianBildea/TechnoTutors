package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	WebDriver driver;
	Actions act;
	
	
	@BeforeTest
	void launchApp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
    options.addArguments("start-maximized");		
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
  @Test (priority=0)
  void goToMoviesApp() {
	  driver.get("https://www.imdb.com/");
	  String expectedtitle = "IMDb - Movies, TV and Celebrities - IMDb";
	  
	  String actualTitle = driver.getTitle(); //method to check a title of the web page
	  
	  if(expectedtitle.equalsIgnoreCase(actualTitle)) {
		  
		  Reporter.log("Launched the app successfully and title is correct");//vreau sa zic ceva in reportul din test ng
		  
		 // System.out.println("Launched the app successfully and title is correct");
	  }else {
		  
		  Reporter.log("Title does not match, may be you are on wrong website");
		  //System.out.println("Title does not match, may be you are on wrong website");
	  }  
	  
	  Assert.assertEquals(expectedtitle, actualTitle);// daca nu mmach titlu testul se opreste
  }
	  
	  @Test (priority=1)
	  void goToMoviesAndTickets() {
	  WebElement movies = driver.findElement(By.xpath("//ul[@id='consumer_main_nav']/li[2]"));
	  act = new Actions(driver);
	  act.moveToElement(movies).build().perform();
	  } 
	  
	  
	 @Test (priority=2) //daca (priority=2,enabled = false) inseamna disable adica testul nu run
	 void letsGoToShowtime() {
		  WebElement show = driver.findElement(By.xpath("//a[@href='/showtimes/?ref_=nv_mv_sh']"));
		 show.click();
		  System.out.println(driver.getTitle());
	  }
	 
   //  @AfterClass
	// void postTest() {
		// driver.quit();
	// }
}


