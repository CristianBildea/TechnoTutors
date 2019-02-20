package com.kijiji.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PetsModul {
WebDriver driver;
public PetsModul(WebDriver driver2)// de ce scriem asta ca daca nu avem eroare si nu deschide Pets?
{//este constructor si trebuie sal folosim ca il avem driver mai jos in pom la action
this. driver=driver2;//? ce e this syntax?
	
}


  @FindBy(how=How.ID,using="cat-menu-item-112")
   WebElement Pets;
  
 @FindBy(how=How.LINK_TEXT,using="Accessories")
 WebElement Accesso;
 
@FindBy(how=How.LINK_TEXT,using="fish")
WebElement Fish;

  public void clickPets() {//daca nu folosim constructor mai sus trebuie sa il punem driver intre ()
	  
	  Actions act = new Actions (driver);
	  act.moveToElement(Pets).click().build().perform();
  }
  public void clickAccesso() {
	 // act.moveToElement(Accesso).click().build().perform();
	  Accesso.click();
	  
  }
	  
  public void fishClick() {
	  Fish.click();
	  driver.navigate().back();
	  driver.navigate().back();
  }
	  
  
  }

