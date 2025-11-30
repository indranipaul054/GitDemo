package Test;
//ITestListener interface which implements TestNG listeners

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//System.out.println("I successfully executed Listeners Pass Code");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		//response if api is failed
		System.out.println("I failed executed Listeners Pass Code"+ result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		
	}
}
