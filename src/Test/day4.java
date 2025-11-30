package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomeloan");
		System.out.println(uname);
		}
	
	@Test
	public void MobileLoginHomeLoan() //exclude this method from execution
	{
		//Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void APIHomeLoan()
	{
		//Rest API Automation
		System.out.println("APIloginhome");
	}

}
