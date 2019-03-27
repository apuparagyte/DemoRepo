package crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verify_title {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) throws InterruptedException {
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
			Thread.sleep(1000);
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();	
	}
}
