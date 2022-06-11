package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{
	// POM class2
	
// Data memeber/variable should be declared globally with access level private by using @FindBy annotation
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']") private WebElement CTNBTN;
	
	// create constructor .. pagefactory class
	public KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// create the method
	
	public void EnterPin(String Pin)
	{
		PIN.sendKeys(Pin);
	}
	
	public void ContinueButton()
	{
		CTNBTN.click();
	}
	

}
