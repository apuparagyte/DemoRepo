package listnerDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(listnerDemo.TestNGListner.class)
public class MyFirstCase {
	
	@Test

	public void GoogleTitleVerify()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit(); 
	}
	@Test
	public void TitleMatch()
	{
		
		System.out.println("Test 2 Dummy");
		AssertJUnit.assertTrue(false);
	}

}
 