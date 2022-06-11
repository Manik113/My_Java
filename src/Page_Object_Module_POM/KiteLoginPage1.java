package Page_Object_Module_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
	// POM class1 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement USERID;
	
	@FindBy(xpath="//input[@id='password']") private WebElement PASS;
	
	@FindBy(xpath="//button[text()='Login ']") private WebElement LOGINBTN;
	
	// Initialize within a constructor with access level public using pagefactory class
	
	public KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilize within a method and access level public
	public void EnterUserID()
	{
		USERID.sendKeys("GP8097");
	}
	
	public void EnterPassword()
	{
		PASS.sendKeys("Swami@0110");
	}
	
	public void ClickLogin()
	{
		LOGINBTN.click();
	}
	
	
}
