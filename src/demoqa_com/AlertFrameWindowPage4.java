package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowPage4 
{
	@FindBy(xpath="") private WebElement AlertFrameWindoHeader;
	
	public AlertFrameWindowPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyAltWindow()
	{
		AlertFrameWindoHeader.getText();
	}

}
