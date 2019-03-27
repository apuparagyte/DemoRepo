package capture_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {


	// TODO Auto-generated method stub
	@Test
	public void capture() throws IOException
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://fmstest.publicpartnerships.com");
		driver.findElement(By.name("ctl00$MainBody$txtUserName1")).sendKeys("QATestAdmin");
		driver.findElement(By.name("ctl00$MainBody$txtPassword1")).sendKeys("9@QATestAdmin");
		driver.findElement(By.name("ctl00$MainBody$btnLogin1")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/ppl.png"));
		System.out.println("Screenshot captured ");
		driver.quit();

	}

}
