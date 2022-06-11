package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Disadvantages 
{
	@Test
	public void TC1()
	{
		String Actual="Hi";
		String Expected="Hi";
		
		Assert.assertNotEquals(Actual, Expected,"Failed: Actual & Expected are same"); // fail
		
		Assert.assertEquals(Actual, Expected,"Failed: Actual & Expected are Different"); // didnt execute that assertion
	}

}
