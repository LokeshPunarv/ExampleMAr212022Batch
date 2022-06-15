package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario6 {
	public static WebDriver browser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginasadmin();
		minimiseflyout();
		createcustomer();
		createproject();
		modifyproject();
		deleteproject();
		deletecustomer();
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
	private static void createcustomer()
	{
		try
		{
			browser.findElement(objectmap.getLocator("Clickontaskbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickoncreatenewcustomer")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickonaddnewcustomer")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Entercustomernamefield")).sendKeys("Google");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickoncreatecustomerbutton")).click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try
		{
			browser.findElement(objectmap.getLocator("Clickontaskbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickontaskbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickoncreatenewcustomer")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonaddnewproject")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("enterprojectnamefield")).sendKeys("Banking");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createprojectclickbutton")).click();
			Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyproject()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickonprojectgearbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("enterdescriptionformodifyproject")).sendKeys("This is Banking Project");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonclosebuttononprojectfield")).click();
			Thread.sleep(1000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickonprojectgearbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonprojectactionbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonprojectdeletebutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonprojectdeletepermanentbutton")).click();
			Thread.sleep(1000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			browser.findElement(objectmap.getLocator("Clickontaskbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("ClickonCustomergearbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("ClickonCustomeractionbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Clickondeletecustomerbutton")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickondeletepermanentcustomerbutton")).click();
			Thread.sleep(1000);
		
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
