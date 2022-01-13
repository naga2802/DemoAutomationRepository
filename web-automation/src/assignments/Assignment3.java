package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
		private static WebDriver oBrowser=null;

		public static void main(String[] args) {


			launch();
			navigate();
			login();
			createconsumer();
			deleteconsumer();
			logout();
			closeApplication();



		}

		private static void launch()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\web-automation\\library\\drivers\\chromedriver.exe");

			oBrowser=new ChromeDriver();

		}

		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:82/login.do");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}




		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
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



		private static void createconsumer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_nameField\"]")).sendKeys("NAGARAJ");
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
				
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteconsumer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

