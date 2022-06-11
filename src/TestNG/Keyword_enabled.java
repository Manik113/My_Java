package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_enabled
{
	@Test
	public void m1()    // mehod / test case
	{
		Reporter.log("Method m1 running",true);
	}
	
	@Test(enabled=false)
	public void m2()
	{
		Reporter.log("Method m2 running",true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("Method m3 is running",true);
	}

}
