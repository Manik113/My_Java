package demoqa_com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQA_TestClass extends BaseClass

{
	// globally declares object of each class
	WebDriver driver;
	DemoQAHomepg1 Homepage1;
	ElementsPage2 Ele;
	WidgetsPage4 Wid;
	AlertFrameWindowPage4 Alt;
	IteractionsPage5 Iter;
	BookStoreApp6 Book;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		InitializeBrowser();
		
		Homepage1=new DemoQAHomepg1(driver);
		Ele=new ElementsPage2(driver);
		Wid=new WidgetsPage4(driver);
		Alt=new AlertFrameWindowPage4(driver);
		Iter=new IteractionsPage5(driver);
		Book=new BookStoreApp6(driver);
		
	}
	
	@BeforeMethod
	public void DemoQaHomePage()
	{
		Homepage1.Elements();
		Homepage1.Forms();
		Homepage1.Alrt_Frame_Window();
		Homepage1.Widgets();
		Homepage1.Intera();
		Homepage1.BookApp();
		
		Ele.VerifyEle_Header();
		Wid.VerifyWidgetsHeader();
		Alt.VerifyAltWindow();
		Iter.VerifyIteractionsHeader();
		Book.VerifyBookAppHeader();
	}
	
	@Test
	public void VerifyEleHeaderVisible()
	{
		Ele.VerifyEle_Header();
	}
	

}
