package com.model.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.model.base.Testbase;
import com.model.pages.Homepage;
import com.model.pages.Loginpage;

public class LoginpageTest extends Testbase {
	Loginpage loginpage;
	static Homepage  homepage;
	
	
	// create constructor for LoginpageTest
	// Super keyword is used in constructor // calls test base constructor "Properties"
	public LoginpageTest()
	{
		super();
	}
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		intialization();
	   loginpage = new Loginpage();
		
	}
	
	@Test(priority=1)
	public void LoginpageTest() {
	String title = Loginpage.validateLoginPage();
	Assert.assertEquals("REGISTER", "REGISTER");
	}
	
	@Test(priority=2)
	public static void Login() {
		homepage =	Loginpage.login(Prop.getProperty("username"));
		
		}
		
	
	
	
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
