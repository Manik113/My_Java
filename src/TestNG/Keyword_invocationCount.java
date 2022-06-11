package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_invocationCount 
{
	@Test(invocationCount=5)
	public void m1()
	{
		Reporter.log("Method m1 is running",true);
	}

}
