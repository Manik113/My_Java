package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
	// POM class1
	
	// Data memeber/variable should be declared globally with access level private by using @FindBy annotation
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement PSW;
	
	@FindBy(xpath="//button[text()='Login ']")     private WebElement  LOGINBTN;
	
	// Initialize within a constructor with access level public using pagefactory class
	public KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// create or declare method with access ..public
	
	public void EnteUserId(String UserID)
	{
		UN.sendKeys();
	}
	
	public void EnterPassword(String Password)
	{
		PSW.sendKeys(Password);
	}
	
	public void ClickLoginBtn()
	{
		LOGINBTN.click();
	}

}
