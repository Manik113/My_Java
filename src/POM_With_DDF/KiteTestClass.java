package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// get required data (Userid,password,PIN) from excel sheet by parameterization
		
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("KITE");
		
		String UserID=Sh.getRow(2).getCell(0).getStringCellValue();   // GP8097
        String Password=Sh.getRow(2).getCell(1).getStringCellValue(); // Swami@0110
        String Pin=Sh.getRow(2).getCell(2).getStringCellValue();      // 449192
        String ExpectedUserID=Sh.getRow(2).getCell(3).getStringCellValue();
		
		
		// create object of POM class1
		KiteLoginPage1 L1=new KiteLoginPage1(driver);
		L1.EnteUserId(UserID);
		L1.EnterPassword(Password);
		L1.ClickLoginBtn();
		
	    // create object of POM class2
		KiteLoginPage2 L2=new KiteLoginPage2(driver);
		L2.EnterPin(Pin);
		L2.ContinueButton();
		
		// create object of POM class3
		KiteHomePage Home=new KiteHomePage(driver);
		Home.VerifyUserID(ExpectedUserID);
		
		
		Thread.sleep(3000);
		driver.close();  
		
		

	}

}
