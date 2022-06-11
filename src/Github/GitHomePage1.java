package Github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHomePage1 
{ 
	
    @FindBy(xpath="//img[@class='avatar avatar-small circle']") private WebElement PROFILE;
	@FindBy(xpath="(//img[@aria-label='Repository'])[1]") private WebElement REPO;
	@FindBy(xpath="//form[@class='logout-form']") private WebElement  SIGNOUTBTN;
	
	public GitHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void MyProfile()
//	{
//		PROFILE.click();
		/*String Uerid=PROFILE.getText();
		return Uerid;*/
		
//	}  
 

     public void VerifyUserName()
	{
		PROFILE.click();
		String Userid=PROFILE.getText();
		
		String Expected="Manik113";
		
		if(Userid.equals(Expected))
		{
			System.out.println("Verify user name test case1 Fail");
		}
		else
		{
			System.out.println("Verify user name test case1 Fail");
		}
		
		
	}
	
	public void RepoName()
	{
		REPO.click();
	}
	public void Signout()
	{
		SIGNOUTBTN.click();
	}
	

}
