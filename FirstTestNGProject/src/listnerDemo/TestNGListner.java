package listnerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test cases start and details are: "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test cases passed and details are: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test cases failed and details are: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		

		System.out.println("Test cases skipped and details are: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}	
}
