package Page_Object_Module_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{
	// POM class2
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']") private WebElement CONTINUEBTN;
	
	// Initialize within a constructor with access level public using Pagefactory class
	
	public KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilize within a method with access level public
	public void EnterPin()
	{
		PIN.sendKeys("449192");
	}
	
	public void ConinueButton()
	{
		CONTINUEBTN.click();
	}
	
	
	

}
