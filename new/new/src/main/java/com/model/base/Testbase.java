package com.model.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.model.util.Testutil;

public class Testbase {
 public static  WebDriver driver;
    public static Properties Prop;
    
    
	public Testbase()
	{
		  try {
                   Prop = new  Properties();
	            FileInputStream ip = new FileInputStream("C:Documents/new/new/src/main/java/com/model/config/config.properties");
	            Prop.load(ip);
	          
	        } catch (FileNotFoundException e) {
	            // TODO
	        	e.printStackTrace();
	        }
		  
		  catch (IOException e) {
		        e.printStackTrace();
		    }
		  
		  
	}


public static void intialization()
{
	String browserName = Prop.getProperty("browser");
	if(browserName.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver=new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.Page_Load_Timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.Implicitly_Timeout, TimeUnit.SECONDS);
	
	driver.get(Prop.getProperty("Url"));



}
}