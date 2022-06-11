package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage4 
{
	@FindBy(xpath="//div[@class='main-header']") private WebElement WidgetsHeader;
	
	public WidgetsPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyWidgetsHeader()
	{
		WidgetsHeader.getText();
	}

}
