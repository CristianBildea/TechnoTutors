package MyPackage;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TryCatchExample {

	public static void main(String[] args) {
		
try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist_000\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized");
				
		WebDriver driver = new ChromeDriver(options);//webDriver is a interface 
		
		//WebTable Example
		//Going to rediff for WebTable
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
		//Declaring two lists of WebElement type
		List<WebElement> allRows = new ArrayList();
		List<WebElement> allColms = new ArrayList();
		
		//Identifyng the table
		
		WebElement myTable = 
				driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		
		//Getting all rows
		allRows = myTable.findElements(By.tagName("tr"));
		int rowCount = allRows.size();//size is the list
		System.out.println(rowCount);
		
		//Getting the columns in row
		for(WebElement row : allRows) {  //loop pt ca e for/ este o lista toate randurile
		allColms = row.findElements(By.tagName("td"));
		for(WebElement col : allColms) {//toate coloanele
			//System.out.println(col.getText());//Printing the value of td
		}
	}
		//Find the value of specific cell : [4,5] /ce facem dace e mare tabelul cum facem sa aflam tot numaram sute de row?
		
		System.out.println(driver.findElement(By.xpath("//table[@class='datTable']/tbody/tr[4]/td[5]")).getText());//tbody este tot tabelul
		
}catch(NoSuchElementException e) {
	System.out.println("There is an exception related to locators, please check your code");
}finally {
	System.out.println("This is finally block!");
}
	}

}
