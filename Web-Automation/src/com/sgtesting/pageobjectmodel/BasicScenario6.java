package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario6 {
	public static WebDriver obrowser=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimiseflyout();
		createcustomer();
		createproject();
		modifyproject();
		deleteproject();
		deletecustomer();
		logout();
		closeapplication() ;

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

	private static void createcustomer() 
	{
		try 
		{
			opage.gettaskcreatecustomer().click();
			Thread.sleep(1000);
			opage.getaddnewcustomer().click();
			Thread.sleep(1000);
			opage.getnewcustomer().click();
			Thread.sleep(1000);
			opage.getentercustomer().sendKeys("Google");
			Thread.sleep(1000);
			opage.getcreatecustomer().click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createproject() 
	{
		try 
		{
			opage.gettaskcreatecustomer().click();
			Thread.sleep(1000);
			opage.getaddnewcustomer().click();
			Thread.sleep(1000);
			opage.getnewproject().click();
			Thread.sleep(1000);
			opage.getprojectname().sendKeys("Banking");
			Thread.sleep(1000);
			opage.getsaveproject().click();
			Thread.sleep(1000);



		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void modifyproject() 
	{
		try 
		{
			opage.getgearclickproject().click();
			Thread.sleep(1000);
			opage.getenterdescription().sendKeys("This is a BankingProject");
			Thread.sleep(1000);
			opage.getclickclosebutton().click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void deleteproject() 
	{
		try 
		{

			opage.getgearclickproject().click();
			Thread.sleep(1000);
			opage.getactionproject().click();
			Thread.sleep(1000);
			opage.getdeleteproject().click();
			Thread.sleep(1000);
			opage.getdeletepermanentproject().click();
			Thread.sleep(1000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer() 
	{
		try 
		{

			opage.geteditcustomer().click();
			Thread.sleep(1000);
			opage.getactioncustomer().click();
			Thread.sleep(1000);
			opage.getdeletecustomer().click();
			Thread.sleep(1000);
			opage.getdeletepermanenetcustomer().click();
			Thread.sleep(1000);
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
