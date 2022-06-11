package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNull 
{
	@Test
	public void TC1()
	{
		String str=null;
		
		Assert.assertNull(str);  // pass
	}
	
	@Test
	public void TC2()
	{
		String str="Manik";
		  
		Assert.assertNull(str);  // fail
	}

}
