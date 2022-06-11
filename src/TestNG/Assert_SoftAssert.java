package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssert 
{
	@Test
	public void TC1()
	{
		String A="Hi";
		String B="Hello";
		String C="Good Morning";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(A, B,"Both result are different ");  //fail
		
		soft.assertEquals(B, C,"Both results are different");  // fail
		
		soft.assertNotEquals(A,B,"Both results are same");   // pass
		
		soft.assertAll();
	}
	
	

}
