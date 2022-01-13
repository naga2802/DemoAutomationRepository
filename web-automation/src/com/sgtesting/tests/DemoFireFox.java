package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "F:\\ExampleAutomation\\Automation\\web-automation\\library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			System.out.println("Firefox Browser Launched");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

