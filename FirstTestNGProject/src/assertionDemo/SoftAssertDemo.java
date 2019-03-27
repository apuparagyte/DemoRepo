package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void testSoft()
	{
		
		SoftAssert assertion=new SoftAssert();
		System.out.println("TEST 1 STARTED");
		assertion.assertEquals(12,13);
		System.out.println("TEST 1 Completed");
		assertion.assertAll();
		
	}
	@Test
	public void testhard()
	{		
		System.out.println("TEST 2 STARTED");
		Assert.assertEquals(12,13);
		System.out.println("TEST 2 Completed");
		
		
	}
}
