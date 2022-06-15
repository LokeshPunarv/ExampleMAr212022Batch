package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//FlyOutwindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Createuser Field
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement createuser; 
	public WebElement getuser()
	{
		return createuser;
	}

	//AddUser Field
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}

	//Firstname Field
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}

	//Lastname Field
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}

	//Email Field
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}


	//Logout Link
	@FindBy(xpath="//*[@id=\"logoutLink\"]")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

	//username for add user
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername1() 
	{
		return userDataLightBox_usernameField;
	}

	//password Field
	private WebElement password;
	public WebElement getpassword() {

		return password;
	}

	//passwordcopy Field
	private WebElement passwordCopy;
	public WebElement getpasswordCopy() {

		return passwordCopy;
	}

	//Submit Create user Field
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement submitcreateuser;
	public WebElement getsubmitcreateuser() 
	{

		return submitcreateuser;
	}


	//Edit user Field
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement edituser;
	public WebElement getedituser() 
	{

		return edituser;
	}

	//Delete user Field
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement deleteuser;
	public WebElement getdeleteuser() 
	{

		return deleteuser;
	}

	//Save Changes in  user Field
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement savechangesuser;
	public WebElement getsavechangesuser() 
	{

		return savechangesuser;
	}

	//Click task  Field
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement taskcreatecustomer;
	public WebElement gettaskcreatecustomer() 
	{

		return taskcreatecustomer;
	}

	//Add new cutomer   Field
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnewcustomer;
	public WebElement getaddnewcustomer() 
	{

		return addnewcustomer;
	}

	// new customer   Field
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newcustomer;
	public WebElement getnewcustomer() 
	{

		return newcustomer;
	}

	// Enter customer   Field

	private WebElement customerLightBox_nameField;
	public WebElement getentercustomer() 
	{

		return customerLightBox_nameField;
	}

	// create customer   Field
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement createcustomer;
	public WebElement getcreatecustomer() 
	{

		return createcustomer;
	}


	// Edit customer   Field
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editcustomer;
	public WebElement geteditcustomer() 
	{

		return editcustomer;
	}

	// Action customer   Field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actioncustomer;
	public WebElement getactioncustomer() 
	{

		return actioncustomer;
	}

	// delete customer   Field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement getdeletecustomer() 
	{

		return deletecustomer;
	}

	// delete permanent customer   Field
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
	private WebElement deletepermanenetcustomer;
	public WebElement getdeletepermanenetcustomer() 
	{

		return deletepermanenetcustomer;
	}

	// Edit customername   Field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement editcustomername;
	public WebElement geteditcustomername() 
	{
		return editcustomername;
	}


	// Click closbutton customer  Field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement closecustomer;
	public WebElement getclosecustomer() 
	{

		return closecustomer;
	}

	//Description
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement description;
	public WebElement getdescription()
	{
		return description;
	}

	//add new project
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject;
	}

	//Enter project name

	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}

	//Save new project
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
	private WebElement saveproject;
	public WebElement getsaveproject()
	{
		return saveproject;
	}

	//Edit new project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement gearclickproject;
	public WebElement getgearclickproject()
	{
		return gearclickproject;
	}

	//action new project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actionproject;
	public WebElement getactionproject()
	{
		return actionproject;
	}


	//delete new project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement getdeleteproject()
	{
		return deleteproject;
	}

	//deletepermanentlynew project

	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanentproject()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}

	//gear new project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement enterdescription;
	public WebElement getenterdescription()
	{
		return enterdescription;
	}

	//close button project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement clickclosebutton;
	public WebElement getclickclosebutton()
	{
		return clickclosebutton;
	}

	//addnewtask project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement newtask;
	public WebElement getnewtask()
	{
		return newtask;
	}

	//create newtask project
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtask;
	public WebElement getcreatenewtask()
	{
		return createnewtask;
	}

	//create task1 project
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement createnewtask1;
	public WebElement getcreatenewtask1()
	{
		return createnewtask1;
	}

	//create task2 project
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
	private WebElement createnewtask2;
	public WebElement getcreatenewtask2()
	{
		return createnewtask2;
	}



	//Save task2 project
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div")
	private WebElement savetask;
	public WebElement getsavetask()
	{
		return savetask;
	}

	//select task project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement selecttask;
	public WebElement getselecttask()
	{
		return selecttask;
	}
	
	//select  action in task
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement actiontask;
		public WebElement getactiontask()
		{
			return actiontask;
		}


	//delete task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement deletetask;
	public WebElement getdeletetasks()
	{
		return deletetask;
	}


	//deletepermanenet task 
	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
	private WebElement deletepermanenttask;
	public WebElement getdeletepermanenttask()
	{
		return deletepermanenttask;
	}



	//Advancecases
	//*Login as user1
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement explorewindow;
	public WebElement getdexplorewindow()
	{
		return explorewindow;
	}



	//*Login as admin  user1 modify pwd and save
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement savechangeuser1;
	public WebElement getsavechangeuser1()
	{
		return savechangeuser1;
	}

	//*Login as admin  user2 modify pwd
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser2;
	public WebElement getselectuser2()
	{
		return selectuser2;
	}

	//*Login as admin  user3 modify pwd
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser3;
	public WebElement getselectuser3()
	{
		return selectuser3;
	}

	//*Deleteuser1
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement delete1;
	public WebElement getdelete1()
	{
		return delete1;
	}
	//*Login as admin  user33 to delete
	@FindBy(xpath="//span[text()='user3, Demo']")
	private WebElement selectuser33;
	public WebElement getselectuser33()
	{
		return selectuser33;
	}


	@FindBy(xpath="//span[text()='user2, Demo']")
	private WebElement selectuser222;
	public WebElement getselectuser222()
	{
		return selectuser222;
	}

	//*Login as admin delete user 1
	@FindBy(xpath="//span[text()='user1, Demo']")
	private WebElement selectuser1;
	public WebElement getselectuser1()
	{
		return selectuser1;
	}
	//*Deleteuser2
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement delete2;
	public WebElement getdelete2()
	{
		return delete2;
	}
	//*Deleteuser3
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement delete3;
	public WebElement getdelete3()
	{
		return delete3;
	}
	
	//new code to selectuser1
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement newselectuser1;
		public WebElement getnewselectuser1()
		{
			return newselectuser1;
		}
	
	//new code to deleteuser1
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement deleteuser1;
	public WebElement getdeleteuser1()
	{
		return deleteuser1;
	}
	
	//new code to selectuser2
			@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement newselectuser2;
			public WebElement getnewselectuser2()
			{
				return newselectuser2;
			}
		
		//new code to deleteuser2
		@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		private WebElement deleteuser2;
		public WebElement getdeleteuser2()
		{
			return deleteuser2;
		}
		
		//new code to selectuser3
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement newselectuser3;
		public WebElement getnewselectuser3()
		{
			return newselectuser3;
		}
	
	//new code to deleteuser3
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement deleteuser3;
	public WebElement getdeleteuser3()
	{
		return deleteuser3;
	}
	
		
	
	
	
	
	
	
	
	
	
	
}
