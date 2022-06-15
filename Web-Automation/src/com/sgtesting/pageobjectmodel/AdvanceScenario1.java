package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {
	public static WebDriver obrowser=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimiseflyout(); 
		createuser1();createuser2();createuser3();
		logout();
		loginasuser1();logout();
		loginasuser2();logout();
		loginasuser3();logout();
		login();
		modifypwd1();modifypwd2();modifypwd3();logout();
		loginuser1modifypwd();logout();
		loginuser2modifypwd();logout();
		loginuser3modifypwd();logout();
		login();
		deleteuser1();
		deleteuser2();
		deleteuser3();
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
	private static void createuser1() 
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("Demo");
			Thread.sleep(2000);
			opage.getlastName().sendKeys("user1");
			Thread.sleep(2000);
			opage.getemail().sendKeys("Demouser1@gmail.com");
			Thread.sleep(2000);
			opage.getusername1().sendKeys("Demouser1");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser1");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser1");
			Thread.sleep(2000);
			opage.getsubmitcreateuser().click();
			Thread.sleep(2000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createuser2() 
	{
		try 
		{

			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("Demo");
			Thread.sleep(2000);
			opage.getlastName().sendKeys("user2");
			Thread.sleep(2000);
			opage.getemail().sendKeys("Demouser2@gmail.com");
			Thread.sleep(2000);
			opage.getusername1().sendKeys("Demouser2");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser2");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser2");
			Thread.sleep(2000);
			opage.getsubmitcreateuser().click();
			Thread.sleep(2000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createuser3() 
	{
		try 
		{

			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("Demo");
			Thread.sleep(2000);
			opage.getlastName().sendKeys("user3");
			Thread.sleep(2000);
			opage.getemail().sendKeys("Demouser3@gmail.com");
			Thread.sleep(2000);
			opage.getusername1().sendKeys("Demouser3");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser3");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser3");
			Thread.sleep(2000);
			opage.getsubmitcreateuser().click();
			Thread.sleep(2000);


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
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void loginasuser1()
	{
		try 
		{
			opage.getUserName().sendKeys("Demouser1");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("Demouser1");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			opage.getdexplorewindow().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try 
		{
			opage.getUserName().sendKeys("Demouser2");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("Demouser2");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			opage.getdexplorewindow().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try 
		{
			opage.getUserName().sendKeys("Demouser3");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("Demouser3");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			opage.getdexplorewindow().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	private static void modifypwd1()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getselectuser1().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser11");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser11");
			Thread.sleep(2000);
			opage.getsavechangeuser1().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void modifypwd2()
	{
		try 
		{

			opage.getselectuser2().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser22");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser22");
			Thread.sleep(2000);
			opage.getsavechangeuser1().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void modifypwd3()
	{
		try 
		{

			opage.getselectuser3().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("Demouser33");
			Thread.sleep(2000);
			opage.getpasswordCopy().sendKeys("Demouser33");
			Thread.sleep(2000);
			opage.getsavechangeuser1().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void loginuser1modifypwd()
	{
		try 
		{

			opage.getUserName().sendKeys("Demouser1");
			opage.getPassword().sendKeys("Demouser11");
			opage.getLogin().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	private static void loginuser2modifypwd()
	{
		try 
		{

			opage.getUserName().sendKeys("Demouser2");
			opage.getPassword().sendKeys("Demouser22");
			opage.getLogin().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void loginuser3modifypwd()
	{
		try 
		{

			opage.getUserName().sendKeys("Demouser3");
			opage.getPassword().sendKeys("Demouser33");
			opage.getLogin().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try 
		{

			opage.getuser().click();
			Thread.sleep(2000);
			opage.getnewselectuser1().click();
			Thread.sleep(2000);
			opage.getdeleteuser1().click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getnewselectuser2().click();
			Thread.sleep(2000);
			opage.getdeleteuser2().click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void deleteuser3()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getnewselectuser3().click();
			Thread.sleep(2000);
			opage.getdeleteuser3().click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
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
