package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driverfactory {
	
	static WebDriver driver= null;
	
	public static WebDriver initializwBrowser(String browserName)
	{ 
		
		if(browserName.equals("chrome"))
		{  
//			ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver();
			
		}else if(browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}else if(browserName.equals("edge"))
		{
			driver= new EdgeDriver();
		}else if(browserName.equals("safari"))
		{
			driver= new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}
	public static WebDriver getdriver()
	{
		return driver;
	}

}
