package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class MyFirstTestNGClass {
	WebDriver driver ;

	
	@BeforeSuite
	void preRequisite() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
    options.addArguments("start-maximized");		
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("This is Before Suite Method");
	}
	
	@AfterSuite
	void postRequisite() {
		System.out.println("This is after suite method");
	}
	
	@BeforeMethod
	void beforeMethod(){
		System.out.println("This is before method");	
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("This is after method");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("This is before class method");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("This is after class method");
	}
	//------------------
	
	@BeforeTest
	void beforeTest() {
		//Navigating to login page
		driver.get("https://www.facebook.com/");
		System.out.println("This is before Test method");
	}

	@AfterTest 
	void afterTest() {
		System.out.println("This is after Test method");
	}
	
	@Test (enabled = false)
	@Parameters ({"firstName"}) //Using Data from XML
	void enterFirstName(String fname) {
			
		//First Name
		WebElement firstName = 
				driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys(fname);
	}
	
	@Test (enabled = false)
	@Parameters ({"lastName"}) //Using Data from XML
	void enterLastName(String lName) {
		
		
		//Sure Name
		WebElement lastName =
				driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys(lName);
						
	}	
	 
	//*******to read data with @DataProvider annotation*******//nu folosim TestNG.xml
	
	@DataProvider(name="FaceBookLoginData") //Data Provider for my FaceBook Test
	Object[][] provideData() {
		
		String [] dataSet1 = {"Sadaf", "Rasool"}; //nr of arguments must be the same (aici 2)
		String [] dataSet2 = {"Cris", "Bildea"};
		String [] dataSet3 = {"Raj", "Powel"};
		String [] dataSet4 = {"Sushma", "Reddy"};
		String [] dataSet5 = {"Hilda", "Neko"};
		
	Object[][] dataSet = {dataSet1, dataSet2, dataSet3, dataSet4, dataSet5};
	return dataSet;
	}
	
	@DataProvider(name="EmailData") //sample Data for Email provider, though we are not using it
	Object[][] provideEmail(){
		
		String[] email1 = {"abc@yahoo.com"};
		String[] email2 = {"abcd@yahoo.com"};
		 Object[][] emailDataSet = {email1, email2};
		 return emailDataSet;
	}
	
	
	@Test(dataProvider ="FaceBookLoginData")
	void enterFirstAndLastName(String fname, String lName) {
	WebElement firstName = 
	driver.findElement(By.xpath("//input[@name='firstname']"));
         firstName.sendKeys(fname);

    WebElement lastName =
    driver.findElement(By.xpath("//input[@name='lastname']"));
     lastName.sendKeys(lName);

     firstName.clear();
     lastName.clear();

	}
}
