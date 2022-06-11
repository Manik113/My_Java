package Page_Object_Module_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{   
	// POM class3
	
	@FindBy(xpath="//span[text()='GP8097']") private WebElement ActUSERID;  // address
	
	// Initialize within a constructor with access level public using Pagefactory class
	
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		// utilize the method 
		
		public void VerifyUserID()
		{
			String ExpectedUserID="GP8097";
			
		    String	ActualUserID=ActUSERID.getText();
		    
		    // compare Expected result to actual result
		    
		    if(ExpectedUserID.equals(ActualUserID))
		    {
		    	System.out.println("Test script is Pass");
		    }
		    else
		    {
		    	System.out.println("Test script is Fail");
		    }
			
		}

}
