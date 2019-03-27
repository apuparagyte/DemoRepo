package test_script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Script {
  @Test
  public void f() {
  WebDriver driver=new FirefoxDriver();
  driver.get("https://paragyte.bitpod.io/apps/Projects/Projects/Issues/views/Issue?IssueNumber=3552");
  driver.close();
  }

}
