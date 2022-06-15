package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario2 {
	public static WebDriver browser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginasadmin();
		minimiseflyout();
		createuser1();logout();
		loginasuser1();createuser2();logout();
		loginasuser2();createuser3();logout();
		loginasuser3();logout();
		loginasuser22();modifypwduser3();logout();
		loginwithmodifiedpwduser3();logout();
		loginasuser11();modifypwduser2();logout();
		loginwithmodifiedpwduser2();logout();
		loginasadmin();
		modifypwduser1();logout();
		loginwithmodifiedpwduser1();logout();
		loginwithmodifiedpwduser2();deleteuser3();logout();
		loginwithmodifiedpwduser1();deleteuser2();logout();
		loginasadmin();deleteuser1();logout();
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
	private static void createuser1()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonadduser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Demo");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserlastname")).sendKeys("user1");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuseremail")).sendKeys("Demouser1@gmail.com");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserusername")).sendKeys("Demouser1");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser1");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser1");;
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createusersubmitbutton")).click();
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
	private static void loginasuser1()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonexplorewindowonloginuser1")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void createuser2()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonadduser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Demo");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserlastname")).sendKeys("user2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuseremail")).sendKeys("Demouser2@gmail.com");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserusername")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createusersubmitbutton")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonexplorewindowonloginuser2")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonadduser")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Demo");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserlastname")).sendKeys("user3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuseremail")).sendKeys("Demouser3@gmail.com");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserusername")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createusersubmitbutton")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonexplorewindowonloginuser3")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser22()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwduser3()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonuser3tomodifypwd")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser33");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser33");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickoncreateuserfieldtosavechanges")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifiedpwduser3()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser3");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser33");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser11()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwduser2()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonuser2tomodifypwd")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser22");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser22");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickoncreateuserfieldtosavechanges")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifiedpwduser2()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser2");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser22");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwduser1()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickonuser1tomodifypwd")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpassword")).sendKeys("Demouser11");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createuserpasswordcopy")).sendKeys("Demouser11");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickoncreateuserfieldtosavechanges")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifiedpwduser1()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginusernameasadmin")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpasswordasadmin")).sendKeys("Demouser11");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginbuttonclick")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser3()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("selectonuser3todelete")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickondeletetodeleteuser3")).click();
			Thread.sleep(1000);
			Alert obj=browser.switchTo().alert();
			obj.accept();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("selectonuser2todelete")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickondeletetodeleteuser2")).click();
			Thread.sleep(1000);
			Alert obj=browser.switchTo().alert();
			obj.accept();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try
		{
			browser.findElement(objectmap.getLocator("clickoncreateusers")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("selectonuser1todelete")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("clickondeletetodeleteuser1")).click();
			Thread.sleep(1000);
			Alert obj=browser.switchTo().alert();
			obj.accept();


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
