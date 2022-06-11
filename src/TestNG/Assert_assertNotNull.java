package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNotNull 
{
	@Test
	public void TC1()
	{
		String A="abcd";
		Assert.assertNotNull(A);     // pass
	}
	
	@Test
	public void TC2()
	{
		String B=null;
		Assert.assertNotNull(B);   // fail
	}

}
