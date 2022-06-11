package Github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitLoginPage 
{
	@FindBy(xpath="//input[@id='login_field']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PSW;
	@FindBy(xpath="/input[@value='Sign in']") private WebElement SignBtn;
	
	public GitLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername()
	{
		UN.sendKeys("Manik113");
	}
	
	public void EnterPassword()
	{
		PSW.sendKeys("Manik@git123");
	}
	
	public void Signin()
	{
		SignBtn.click();
	}

}
