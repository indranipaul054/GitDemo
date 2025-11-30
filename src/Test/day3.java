package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL", "APIKEY/username"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("weblogincarloan");
		System.out.println(urlname);
		System.out.println(key);
		}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() //exclude this method from execution
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println(" I will execute before every test method in day3 class");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println(" I will execute after every test method in day3 class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after executing all methods in the class");
	}
	@BeforeSuite
	public void BfSuite() //exclude this method from execution
	{
		//Appium
		System.out.println("I am no.1 from last");
	}
	
	
	@Test(enabled=false)
	public void MobileSignInCarLoan() //exclude this method from execution
	{
		//Appium
		System.out.println("MobileSignincar");
	}
	
	@Test (dataProvider = "getData")
	public void MobileSignOutCarLoan(String username, String password) //exclude this method from execution
	{
		//Appium
		System.out.println("MobileSignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","MobileSignOutCarLoan"})
	public void APIcarLoan()
	{
		//Rest API Automation
		System.out.println("APIloginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st Combination- username and password-good credit history
		//2nd Combination- username and password- no credit history
		//3rd - Fradulent credit history
		Object[][] data= new Object[3][2];
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password1";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="password2";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="password3";
		
		return data;
		
		
	}

}
