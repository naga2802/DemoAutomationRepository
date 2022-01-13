package com.sgtesting.assignments2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	public static WebDriver oBrowser=null;
	public static AssignmentActitime oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		ModifyUser();
		deleteUser();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new AssignmentActitime (oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassWord().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreateUser().click();
			oPage.getAddUser().click();
			oPage.getCreateuserFirstname().sendKeys("jay");
			oPage.getCreateUserLastName().sendKeys("maddy");
			Thread.sleep(2000);
			oPage.getCreateUserEmail().sendKeys("jayMaddyi@gmail.com");
			oPage.getCreateUsername().sendKeys("jay");
			oPage.getCreateUserpassword().sendKeys("123456");
			oPage.getCreateUserConfirmPassword().sendKeys("123456");
			oPage.getCreateUserConfirm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUser()
	{
		try
		{
			oPage.getCreateUserToModify().click();
			Thread.sleep(3000);
			oPage.getCreateUserToModifypassword().sendKeys("1234");
			oPage.getCreateUserToModifyConfirmpassword().sendKeys("1234");
			Thread.sleep(1000);
			oPage.getconfirmModifytosavechanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try {
			oPage.getselectCreateusertoDelete().click();
			Thread.sleep(3000);
			oPage.getselectDeleteUser().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}


