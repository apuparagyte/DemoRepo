package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts1 {

	@Test
	public void test1()
	{
		String mystr="Apurva";
		Assert.assertTrue(mystr.contains("Sachin"),"names are not matching");
		
	}
	@Test
	public void test2()
	{
		
		Assert.assertTrue(false);
		
	}
}
