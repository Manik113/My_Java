package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert_assertFalse 
{
	@Test
	public void TC1()
	{
		boolean result=false;
		
		Assert.assertFalse(result);
	}
	
	@Test
	public void TC2()
	{
		boolean result=true;
		
		Assert.assertFalse(result);
	}

}
