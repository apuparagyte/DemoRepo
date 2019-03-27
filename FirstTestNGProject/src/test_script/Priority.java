package test_script;

import org.testng.annotations.Test;

public class Priority {
	@Test
	public void startApp()
	{
		System.out.println("startAPP");
	}
	@Test
	public void beforestartApp()
	{
		System.out.println("beforestartApp");
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("loginAPP");
	}
	@Test
	public void logoutApp()
	{
		System.out.println("logoutAPP");
	}
	@Test 
	public void application()
	{
		System.out.println("application");
	}
	@Test
	public void beforeapplication()
	{
		System.out.println("beforeapplication");
	}
}
