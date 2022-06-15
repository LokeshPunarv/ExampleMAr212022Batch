package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario2 {
	public static WebDriver browser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginasadmin();
		minimiseflyout();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeapplication();

	}
	private static void launchbrowser()
	{
		try
		{
			filename="C:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			browser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			browser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasadmin()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("admin");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("manager");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimiseflyout()
	{
		try
		{
			browser.findElement(objectmap.getLocator("Minimiseflyoutbuttonclick")).click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonadduser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Demo");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserlastname")).sendKeys("user1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuseremail")).sendKeys("Demouser1@gmail.com");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserusername")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createusersubmitbutton")).click();
			Thread.sleep(1000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			
			browser.findElement(objectmap.getLocator("clicktoselectuser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser11");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser11");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("ClickonSavechangesincreateuser")).click();
			Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clicktoselectuser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clicktodeleteuser")).click();
			Thread.sleep(1000);
			Alert oalert = browser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			browser.findElement(objectmap.getLocator("Logoutasadmin")).click();
			Thread.sleep(1000);
			
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try
		{
			browser.quit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
