package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");

		
		//Launch Application
		WebDriver driver = new ChromeDriver();// we most to imported
		driver.get("http:\\google.com");
		
		
		//boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		// System.out.println(b);
		 
		 //driver.findElement(By.xpath("//a[@href='https://www.google.ca/imghp?hl=en&tab=wi']")).click();
		 
		// driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		
		//driver.findElement(By.id("lst-ib")).sendKeys("Cristian Bildea");//Using Id
		
		//driver.findElement(By.partialLinkText("Ima")).click();
		
		
		//driver.findElement(By.name("btnK")).click();// Using Name
		
		
	}

}
