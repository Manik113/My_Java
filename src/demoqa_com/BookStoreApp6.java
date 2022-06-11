package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApp6 
{
	@FindBy(xpath="//div[@class='main-header']") private WebElement BookAppHeader;
	
	public BookStoreApp6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyBookAppHeader()
	{
		BookAppHeader.getText();
	}

}
