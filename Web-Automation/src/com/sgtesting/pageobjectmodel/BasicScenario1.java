package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario1 {
	public static WebDriver obrowser=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimiseflyout(); 
		createuser();
		deleteuser();
		logout();
		closeapplication();

	}
	private static void launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser =new ChromeDriver();
			opage=new ActiTimePage(obrowser);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	private static void navigate() 
	{
		try 
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	private static void login() 
	{
		try 
		{
			opage.getUserName().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			opage.getLogin().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void minimiseflyout() 
		{
			try 
			{
				opage.getFlyOutWindow().click();
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void createuser() 
		{
			try 
			{
				opage.getuser().click();
				Thread.sleep(1000);
				opage.getadduser().click();
				Thread.sleep(1000);
				opage.getfirstname().sendKeys("Demo");
				Thread.sleep(1000);
				opage.getlastName().sendKeys("user1");
				Thread.sleep(1000);
				opage.getemail().sendKeys("Demouser1@gmail.com");
				Thread.sleep(1000);
				opage.getusername1().sendKeys("Demouser1");
				Thread.sleep(1000);
				opage.getpassword().sendKeys("Demouser1");
				Thread.sleep(1000);
				opage.getpasswordCopy().sendKeys("Demouser1");
				Thread.sleep(1000);
				opage.getsubmitcreateuser().click();
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}
		private static void deleteuser() 
		{
			try 
			{
				opage.getedituser().click();
				Thread.sleep(1000);
				opage.getdeleteuser().click();
				Thread.sleep(2000);
				Alert obj=obrowser.switchTo().alert();
				obj.accept();
			
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}
		
		private static void logout() 
		{
			try 
			{
				opage.getLogout().click();
				Thread.sleep(1000);
				
				
			
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}
		
		private static void closeapplication() 
		{
			try 
			{
				obrowser.quit();
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}




}
