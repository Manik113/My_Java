package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://kite.zerodha.com/");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// In data driven framework we cant use direct data, first store in excel sheet & fetch from it .. for data privacy
		//to reach Excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		// Select particular sheet name ..where data is store
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Data");
		
		// Enter user Id ... first get user id from excel sheet
		
		String UserID=Sh.getRow(1).getCell(0).getStringCellValue();
		
		// Password
		String Password=Sh.getRow(1).getCell(1).getStringCellValue();
		
		// PIN
		String Pin=Sh.getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(UserID);  // Enter UserId
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);  // Enter the password
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();  // Click on login button
		
		// enter the pin
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(Pin);
		
		Thread.sleep(1000);
		
		// click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		// verify the UserId
		
		String ExpUserId=Sh.getRow(1).getCell(3).getStringCellValue();
		
		String ActUserId=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		// check the Test script pass or fail
		
		if(ExpUserId.equals(ActUserId))
		{
			System.out.println("Test Is Pass");
		}
		else
		{
			System.out.println("Test is Fail");
		}
			
		Thread.sleep(1000);
		
		driver.close();
		
		
		

	}

}
