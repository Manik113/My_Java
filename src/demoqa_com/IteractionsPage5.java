package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IteractionsPage5 
{
	@FindBy(xpath="//div[@class='main-header']") private WebElement IteractionsHeader;
	
	public IteractionsPage5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyIteractionsHeader()
	{
		IteractionsHeader.getText();
	}

}
