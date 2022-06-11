package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertEquals 
{
	@Test
	public void AssertEquals()
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected result is different");
	}
	
	@Test
	public void AssertEquals1()
	{
		String ActualResult="Virat";
		String Expected="Rohit";
		
		Assert.assertEquals(ActualResult, Expected,"Failed: Actual & Expected result is different");
	}

}
