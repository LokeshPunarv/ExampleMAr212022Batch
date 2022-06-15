package com.sgtesting.advancescenariotestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceScenarioTestng2 {
	public static WebDriver obrowser=null;
	@Test(priority=1)
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
	@Test(priority=2)
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
	@Test(priority=3)
	private static void loginasadmin1() 
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
	@Test(priority=4)
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
	@Test(priority=5)
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
	@Test(priority=6)
	private static void logout1() 
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
	@Test(priority=7)
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
	@Test(priority=8)
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
	@Test(priority=9)
	private static void logoutasuser1() 
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
	@Test(priority=10)
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
	@Test(priority=11)
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
	@Test(priority=12)
	private static void logoutasuser2() 
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
	@Test(priority=13)
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
	@Test(priority=14)
	private static void logoutasuser3() 
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
	@Test(priority=15)
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
	@Test(priority=16)
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
	@Test(priority=17)
	private static void logoutasuser22() 
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
	@Test(priority=18)
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
	@Test(priority=19)
	private static void logoutasuser33() 
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
	
	@Test(priority=20)
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
	@Test(priority=21)
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
	@Test(priority=22)
	private static void logoutasuser11() 
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
	@Test(priority=23)
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
	@Test(priority=24)
	private static void logoutasuser222() 
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
	
	@Test(priority=25)
	private static void loginasadmin11() 
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
	@Test(priority=26)
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
	@Test(priority=27)
	private static void logoutasadmin2() 
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
	
	@Test(priority=28)
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
	@Test(priority=29)
	private static void logoutasuser111() 
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
	@Test(priority=30)
	private static void loginwithmodifypwduser22()
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
	@Test(priority=31)
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
	@Test(priority=32)
	private static void logoutasuser333() 
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
	@Test(priority=33)
	private static void loginwithmodifypwduser11()
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
	@Test(priority=34)
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
	@Test(priority=35)
	private static void logoutasuser1111() 
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
	@Test(priority=36)
	private static void loginasadmin22() 
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
	@Test(priority=37)
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
	@Test(priority=38)
	private static void logoutasadmin33() 
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
	@Test(priority=39)
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
