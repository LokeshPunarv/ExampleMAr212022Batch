package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario2 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginasadmin();
		minimizeflyout();createuser1(); logout();
		loginasuser1();createuser2(); logout();
		loginasuser2();createuser3();logout();
		loginasuser3();logout();
		loginasuser22();modifypwduser3();logout();
		loginwithmodifypwduser3();logout();
		loginasuser11();modifypwduser2();logout();
		loginwithmodifypwduser2();logout();
		loginasadmin();
		modifypwduser1();logout();
		loginwithmodifypwduser1();logout();
		loginwithmodifypwduser2();Deleteuser3();logout();
		loginwithmodifypwduser1();Deleteuser2();logout();
		loginasadmin();Deleteuser1();logout();
		closeapplication();
		
	
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser =new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate() 
	{
		try
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasadmin() 
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyout() 
	{
		try
		{
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
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
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("Demouser1@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2() 
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("Demouser2@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("Demouser3@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			obrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void loginasuser11() 
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void loginasuser22() 
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
			obrowser.findElement(By.name("username")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}

	private static void modifypwduser1()
	{
		try
		{
			
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user1, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);



		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void modifypwduser2()
	{
		try
		{
			
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user2, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
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
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user3, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifypwduser1()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifypwduser2()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifypwduser3()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user1, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user2, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user3, Demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);


		}catch(Exception e)

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


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
}
