package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchbroswer();
		navigate();
		Login();
		minimizeflyout();
		createcustomer();
		Createproject();
		addtask();
		deletetask();
		DeleteProject();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchbroswer() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			obrowser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate() {
		try {
			obrowser.get("http://localhost:82/login.do");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Login() {
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
	private static void createcustomer() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("new customer");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Createproject() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("New Project");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectDescriptionField\']")).sendKeys("This is a new Project");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void addtask() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("TASK1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void deletetask() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

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
	private static void logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);

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

