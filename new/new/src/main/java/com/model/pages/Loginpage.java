package com.model.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.model.base.Testbase;

public class Loginpage extends Testbase{

	// page factory or Object Repositry
	@FindBy(id="email")
    static
	WebElement username;
	
	
	@FindBy(xpath ="//*[@id=\"arrow\"]")
	static
	WebElement Arrowbtn;


	public Loginpage()
	{	
	
		PageFactory.initElements(driver, this);
		// this current clas  Object
}
	public static String validateLoginPage()
	{
		return driver.getTitle();
	}
	
	public static  Homepage login(String UN)
	{
		username.sendKeys("UN");
		Arrowbtn.click();
		
		return new Homepage();
	}
	
}
