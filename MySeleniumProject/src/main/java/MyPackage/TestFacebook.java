package MyPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestFacebook {

	public static void main(String[] args) {// public.... is syntax)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized");
		
		
		WebDriver driver = new ChromeDriver(options);//webDriver is a interface  
		
		//Navigating to login page
		driver.get("https://www.facebook.com/");
		
		//First Name
		WebElement firstName=  //este alta varianta in care putem scrie methoda sau scriptul
		driver.findElement(By.xpath("//input[@id='u_0_j']"));
		firstName.sendKeys("Cristian");
		
		
		//Sure Name
		driver.findElement(By.xpath("//input[@id='u_0_l'][@name='lastname']")).sendKeys("Bildea");
		
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("6474413991");
		
		//check if Male is selected
		boolean isMaleChecked = driver.findElement(By.xpath("//input[@id='u_0_a']")).isSelected();//is selectet is method
		if(isMaleChecked==false) {// putem folosi si pt check box la fel/ el verifica daca e checked sau nu ,false inseamna ca nu e checked este fals 
			driver.findElement(By.xpath("//input[@id='u_0_a']")).click();//checking Male if it is not checked
		}
			//**---Expected value for label------***
				
			// nu folosim getAttribut String s =driver.findElement(By.xpath("//div[@id='u_0_10']")).getAttribute("By clicking Sign Up, you agree to our Terms, Data Policy and Cookie Policy. You may receive SMS notifications from us and can opt out at any time.");
			
			String expectedVal = "By clicking Sign Up, you agree to our Terms, Data Policy and Cookie Policy."
					+ " You may receive SMS notifications from us and can opt out at any time.";
			//Getting the actual text
			
			String s = driver.findElement(By.xpath("//div[@id='u_0_10']/p")).getText();// de ce p?
			System.out.println(s);
					
					//Comparing the values
			boolean valMatched = expectedVal.equalsIgnoreCase(s);// nu folosim equels
			if(valMatched==true) {
				System.out.println("Text is same");}
				else {
					System.out.println("Text is not same");
				}
					
			//Selecting  the Day using Value
			WebElement day =
			driver.findElement(By.xpath("//select[@id='day']"));
			Select sel = new Select(day);//new class name is Select si trebuie importat
			sel.selectByValue("9");
			
			//Selecting  the Month using Visible Text
			WebElement month =
					driver.findElement(By.xpath("//select[@id='month']"));
			sel = new Select(month);
			sel.selectByVisibleText("May");
			
			//Selecting the Year using Index
			WebElement year =
					driver.findElement(By.xpath("//select[@id='year']"));
			sel = new Select(year);
			sel.selectByIndex(39);
			
			//Click on Submit
			
			driver.findElement(By.xpath("//button[@id='u_0_11'][@name='websubmit']")).click();
			
	}
}
		



