package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_Sample1 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running test case1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running test case2",true);
	}

}
