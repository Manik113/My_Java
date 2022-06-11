package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_Disable1 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running test case TC1",true);
	}
	
	@Test
	public void TC2()
	{
		//Assert.fail();
		Reporter.log("Running test case TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running test case TC3",true);
	}

}
