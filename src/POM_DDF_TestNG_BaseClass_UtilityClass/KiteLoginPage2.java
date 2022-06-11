package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{
	// POM class2
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(linkText="Continue ") private WebElement CtnBtn;
	
	public KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods/TC
	public void enterPin(String b)
	{
		Pin.sendKeys(b);
	}
	public void continueClick()
	{
		CtnBtn.click();
	}

}
