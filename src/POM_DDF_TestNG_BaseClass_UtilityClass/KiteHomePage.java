package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	// POM class3
	@FindBy(linkText="GP8097") private WebElement UserName;
	@FindBy(linkText=" Logout") private WebElement LogOut;
	
	// constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Methods/TC
	public String getKiteHomePageuserId()
	{
		String UserIDValue=UserName.getText();
		return UserIDValue;
	}
	public void clickUserId()
	{
		UserName.click();
	}
	public void clickLogout()
	{
		LogOut.click();
	}

}
