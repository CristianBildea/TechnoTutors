package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstHomeProjFacebook {

	public static void main(String[] args) throws Exception {
		//descarcare web driver si initiat chrome driver se caura pe net pt selenium
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https:\\facebook.com");// method
     
     Thread.sleep(20000);//wait method- is in millsecond=20 sec
     driver.findElement(By.id("u_0_a")).click();//cum se numeste campul asta? R: is code 
     //driver is object, findElement method, ce este in paranteze este argument, By is class, and call by name method id is static method
     //overloding
     
     driver.findElement(By.name("birthday_day")).click(); 
     
     driver.findElement(By.name("birthday_day")).sendKeys("14");
		                                                              
     
		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("Cristian");
		
		boolean b = driver.findElement(By.xpath("//img[@width='537']")).isDisplayed();//all the time boolean
		System.out.println(b);
		
		//driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form\']")).click();
		
		
		
		
		
	}

}
