package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	// POM class 3
	
   @FindBy(xpath="//span[text()='GP8097']") private WebElement	USERID;
   
   // craete constructor of class
   
   public KiteHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   // create method 
   
   public void VerifyUserID(String ExpectedUserID)
   {
	  String ActualUserId= USERID.getText();
	  
	  if(ExpectedUserID.equals(ActualUserId))
	  {
		  System.out.println("Test script is Pass");
	  }
	  else
	  {
		  System.out.println("Test script is Fail");
	  }
	  
   }
   

}
