package test_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Class1 {
	WebDriver driver=new FirefoxDriver();

	@Test(groups = { "bonding", "strong_ties" })	
	public void tc01LaunchURL() {	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://www.demo.guru99.com/V4/");	
	}	

	@Test(groups = { "bonding" })	
	public void tc02VerifyLaunchPage() {	
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Guru99 Bank'])")).isDisplayed(),"Home Page heading is not displayed");	
		System.out.println("Home Page heading is displayed");	
	}	

	@Test(groups = { "bonding", "strong_ties" })	
	public void tc03EnterCredentials() {	
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr28642");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ydAnate");	
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
}

