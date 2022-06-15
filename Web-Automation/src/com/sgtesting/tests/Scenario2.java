package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createuser();
		Modifyuser();
		deleteuser();
		Logout();
		closeapplication();
		

	}
	private static void launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void navigate() {
		try {
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void minimizeflyout()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Modifyuser() {
		try {
			obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Sample");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void deleteuser() {
		try {
			obrowser.findElement(By.xpath("//span[text()='user1, Sample']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert oalert = obrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void closeapplication() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

