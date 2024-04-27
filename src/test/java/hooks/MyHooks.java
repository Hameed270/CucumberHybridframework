package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {
	
	WebDriver driver;
	
	
	
	@Before
	public void setup() throws IOException

	{
		
		Properties prop = new ConfigReader().intializeProperties();
		
		driver=Driverfactory.initializwBrowser(prop.getProperty("brower"));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	@After
	public void tearDown(Scenario scenario)
	{
		String scenarioName = scenario.getName().replaceAll(" ","_");
		
		if (scenario.isFailed())
		{
			byte[] srcScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenShot, "image/png", scenarioName);
			
		}
		driver.quit();
	}

}
