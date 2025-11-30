package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void LastExecution()
	{
	System.out.println("I will execute last");
	//Assert.assertTrue(false);
	}
	
	@Test
	public void Demo()
	{
	System.out.println("hello");
	Assert.assertTrue(false);
	System.out.println("hI");
	Assert.assertTrue(true);
	}
	
	@AfterSuite
	public void AfSuite()
	{
	System.out.println("I am the last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
