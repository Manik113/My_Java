package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTestClass extends BaseClass
{
	Kiteloginpage1 login1;
	KiteLoginPage2 login2;
	KiteHomePage Home;
	
	@BeforeClass
	public void OpenBrowser()
	{
		// open browser
		initializeBrowser();
		login1=new Kiteloginpage1(driver);
		login2=new KiteLoginPage2(driver);
		Home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void LoginPage() throws IOException
	{
		// Enter UN
		login1.enterUserID(Utility_Class.getDataFromPF("UN"));
		login1.enterPassword(Utility_Class.getDataFromPF("PSW"));
		login1.clickloginbtn();
		
		login2.enterPin(Utility_Class.getDataFromPF("PIN"));
		login2.continueClick();
		
	}
	
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException
	{
		String ActualUserID=Home.getKiteHomePageuserId();
		
		String Expected=Utility_Class.getTD(0, 3);
		
		Assert.assertEquals(ActualUserID, Expected);
	}
	
	
	
	

}
