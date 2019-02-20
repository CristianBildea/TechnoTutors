package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverAndWaitsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");//initialisation
        ChromeOptions options = new ChromeOptions();//putem sa afla pe net la google chrome option
        options.setExperimentalOption("useAutomationExtension", false);//daca sunt pop up sa la eliminam
        options.addArguments("start-maximized");		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.ca/");//https este url
		
		//---------Implicit Wait---------//se afla si pe google
		//This implies that driver instance will wait for every(all) WebElement care se afla in scriptul nostru to a maximum of 10 sec(sau alt timp)
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		
		//Mouse Hover
		Actions act = new Actions(driver); // driver is the argument, folosim the web driver
		WebElement department = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		act.moveToElement(department).build().perform();
		
		
		//Mouse Hover
		WebElement booksAndAudible = driver.findElement(By.xpath("//span[@aria-label='Books & Audible']"));
		act.moveToElement(booksAndAudible).build().perform();
		
		
		WebElement allBooks = driver.findElement(By.xpath("//a[@href='/books-used-books-textbooks/b/ref=nav_shopall_bo?ie=UTF8&node=916520']"));
		
			
		//------Explicit Wait------
		//This will wait until(for one webelement care vrem sal astepte) 'all Books'(sau alt element) link is clickable
		WebDriverWait wait = new WebDriverWait(driver, 15);//15 sec is maximum time to whait for this particular element
		wait.until(ExpectedConditions.elementToBeClickable(allBooks));
		
		allBooks.click();
		
	}

}
