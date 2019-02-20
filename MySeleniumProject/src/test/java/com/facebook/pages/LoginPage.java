package com.facebook.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	//WebDriver driver;/nu trebuie sal folosim pt ca nu il avem mai jos imn POM (daca aveam driver.find element atunci trebuia)
	
	@FindBy(how=How.ID,using="email")
	WebElement userName;
	
	@FindBy(how=How.ID,using="pass")
	WebElement password;
	
	@FindBy(how=How.ID,using="u_0_2")		
	WebElement loginBtn;
	
	
	public void enterUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void enterPassword(String pswrd) {
		password.sendKeys(pswrd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
    
}
