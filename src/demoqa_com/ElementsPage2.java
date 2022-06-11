package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage2 
{
	@FindBy(xpath="//div[@class='main-header']") private WebElement Elements_Header;
	
	public ElementsPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyEle_Header()
	{
		Elements_Header.getText();
	
	}

}
