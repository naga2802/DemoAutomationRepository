package assignments;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment4 {
		private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			lanuchBrowser();
			navigate();
			login();
			minimizeFlyoutWindow();
			custamerUser();
			modifyuser();
			deletcustamer();
			logout();
			closeAppliction();
		}
		private static void lanuchBrowser()
		{
			try
			{
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.navigate().to("http://localhost:82/login.do");
				Thread.sleep(4000);
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
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
             Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimizeFlyoutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void custamerUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("nagaraj");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[23]/div[2]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deletcustamer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
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
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeAppliction()
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
