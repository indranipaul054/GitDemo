package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void plan()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.print("I will execute first");
	}

}
