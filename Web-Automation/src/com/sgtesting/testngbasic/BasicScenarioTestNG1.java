package com.sgtesting.testngbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicScenarioTestNG1 {
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	private static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=3,dataProvider="logindetails")
	private static void login(String user, String pwd) 
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	private static void minimizeflyout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="userdetails")
	private static void createuser(String fname, String lname,String email, String uname, String pwd1, String pwd1copy) 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys(uname);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pwd1);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd1copy);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	private static void deleteuser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	private static void logout() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=7)
	private static void closeapplication() 
	{
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@DataProvider(name="logindetails")
	public Object[][] getlogindata()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="userdetails")
	public Object[][] getuserdetailsdata()
	{
		return new Object[][] {{"Demo","user1","Demouser1@gmail.com","Demouser1","Demouser1","Demouser1"}};
	}
	
	


}
