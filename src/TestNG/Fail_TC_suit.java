package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail_TC_suit 
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
