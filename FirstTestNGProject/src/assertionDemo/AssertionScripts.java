package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {

	@Test
	public void test1()
	{
		
		Assert.assertEquals(0, 12);
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test case2 started");
		Assert.assertEquals(0, 12, "Dropdown count does not match please check with Developer");
		System.out.println("Test case2 Failed Completed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test case3 started");
		Assert.assertEquals("Hello","Hello", "Words does not match please rasie a bug");
		System.out.println("Test case3 Completed");
	}

}
