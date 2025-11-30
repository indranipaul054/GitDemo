package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public <String> void WebLoginHomeLoan(String uname)
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
		System.out.println("MobileLoginWeb");
		System.out.print("True");
		System.out.println("Mobileloginhome");
		System.out.println("MobileLoginWeb");
		System.out.print("True");
	}
	@Test
	public void APIHomeLoan()
	{
		//Rest API Automation
		System.out.println("APIloginhome");
		System.out.println("APIloginhome");
	}

}
