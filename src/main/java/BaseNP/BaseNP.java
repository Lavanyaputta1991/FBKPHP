package BaseNP;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseNP
{

			public static String browser="chrome";
			public static  WebDriver driver;
			public static String url="https://fb.com";
			public static void Init_browser()
			{
				switch(browser)
				{
				case "IE":
					System.setProperty("webdriver.IE.driver","D:\\SELENIUM\\InternetExplorerdriver.exe");
					driver=new InternetExplorerDriver();
					break;
					
				case "chrome":
					System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
					driver=new ChromeDriver();
					break;
					
				case "firefox":
					System.setProperty("webdriver.firefox.driver","D:\\SELENIUM\\firefoxdriver.exe");
					driver=new FirefoxDriver();
					break;
					
					default:
						System.out.println("NO such browser exist");
					
				}
			}
			
			public static void Application_url(String url) throws BrowserException
			{
				if(  (url.indexOf("https")!=0) || (url.length()==0) )
				{
					throw new BrowserException("Invalid url..Please check it");	
				}
				
				driver.get(url);
				driver.manage().window().maximize();
			}
			
			public static void browser_close()
			{
				driver.close();
				driver.quit();
			}
			
			public static String get_title()
			{
				return driver.getTitle();
			}
			
			public static String get_current_url()
			{
				return driver.getCurrentUrl();
				
			}
			
			
	}


