package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage1 
{
	//POM class1
	
	@FindBy(id="userid") private WebElement USERID;
	@FindBy(id="password") private WebElement psw;
	@FindBy(linkText="Login ") private WebElement LoginBtn;
	
	// Initialize within a constructor with access level public using PageFactory class
	public Kiteloginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Utilize within a method with access level public 
	public void enterUserID(String Uesrid)    //GP8097
	{
		USERID.sendKeys(Uesrid);
	}
	
	public void enterPassword(String a)
	{
		psw.sendKeys(a);
	}
	
	public void clickloginbtn()
	{
		LoginBtn.click();
	}

}
