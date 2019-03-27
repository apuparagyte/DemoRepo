package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class verify_error_message {
	public static void main(String args[])
	{	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//String actual_result=driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
		String actual_result1=driver.findElement(By.xpath(".//*[@id='identifierId']")).getAttribute("innerHTML");
		String Expected_result="Enter an email or phone number";
		//Type 1
		Assert.assertEquals(actual_result1, Expected_result);
		//Type 2
		Assert.assertTrue(actual_result1.contains("email"));
		System.out.println("Able to see the error message:"+actual_result1);
		driver.close();
	}
}