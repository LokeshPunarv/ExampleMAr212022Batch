package com.sgtesting.testngbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicScenarioTestNG5 {
	public static WebDriver obrowser=null;
	@Test(priority=1)
	private static void launchbroswer() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			obrowser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=2)
	private static void navigate() {
		try {
			obrowser.get("http://localhost:82/login.do");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=3,dataProvider="logindetails")
	private static void login(String user, String pwd) {
		try {
			obrowser.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
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
			obrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="customerdetails")
	private static void createcustomer(String cname )
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys(cname);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=6,dataProvider="projectdetails")
	private static void createproject(String pname ) {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys(pname);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=7)
	private static void DeleteProject() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=8)
	private static void deletecustomer() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(1000);

		} catch (Exception e) {

		}

	}
	@Test(priority=9)
	private static void logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority=10)
	private static void closeapplication() {
		try {
			obrowser.quit();	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@DataProvider(name="logindetails")
	public Object[][] getlogindata()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="customerdetails")
	public Object[][] getcustomerdata()
	{
		return new Object[][] {{"Google"}};
	}
	@DataProvider(name="projectdetails")
	public Object[][] getprojectdetailsdata()
	{
		return new Object[][] {{"Banking"}};
	}
}
