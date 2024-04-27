package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	WebDriver driver;
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnElement(WebElement element,long durationInSeconds) {
		
		WebElement webElement = waitForElement(element,durationInSeconds); 
		webElement.click();
				
	}
	
	public void typedTextIntoElement(WebElement element,String textToBeTyped,long durationInSeconds) {
		
		 
		WebElement webElement = waitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);
		
		
	}
	
	public WebElement waitForElement(WebElement element,long durationInSeconds){
		WebElement webElement=null;
		
		try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds)); 
		webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Throwable e){
			e.printStackTrace();
		}
		return webElement;
	}
	
	public void selectOptionInDropdown(WebElement element,String dropDrownOption,long durationInSeconds) {
		
		WebElement webElement = waitForElement(element,durationInSeconds);
		Select select=new Select(element);
		select.selectByVisibleText(dropDrownOption);
	}
	
	public void acceptAlert() {
		
		
	}

}
