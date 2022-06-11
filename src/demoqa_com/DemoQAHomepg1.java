package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAHomepg1
{
	// POM class1
	
	@FindBy(xpath="//h5[text()='Elements']") private WebElement ELEMENTS;
	@FindBy(xpath="//h5[text()='Forms']") private WebElement FORMS;
	@FindBy(xpath="//h5[text()='Forms']") private WebElement A_F_Windows;
	@FindBy(xpath="//h5[text()='Widgets']") private WebElement WIDGETS;
	@FindBy(xpath="//h5[text()='Interactions']") private WebElement Interactions;
	@FindBy(xpath="//h5[text()='Book Store Application']") private WebElement BooK_App;
	
	public DemoQAHomepg1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Elements()
	{
		ELEMENTS.click();
	}
	public void Forms()
	{
		FORMS.click();
	}
	public void Alrt_Frame_Window()
	{
		A_F_Windows.click();
	}
	public void Widgets()
	{
		WIDGETS.click();
	}
	
	public void Intera()
	{
		Interactions.click();
	}
	
	public void BookApp()
	{
		BooK_App.click();
	}

}
