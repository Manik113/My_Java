package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage3 
{

	@FindBy(xpath="//div[@class='main-header']") private WebElement Forms_Header;
	
	public FormsPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyFormHeader()
	{
		Forms_Header.getText();
	}
}
