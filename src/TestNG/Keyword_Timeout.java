package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Timeout 
{
	@Test(timeOut=5000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Method m1 is running",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Method m2 is Running",true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("Method m3 is running",true);
	}

}
