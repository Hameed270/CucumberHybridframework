package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailfield;
	public void enterEmailAddress(String emailText)
	{
		emailfield.sendKeys(emailText);
	}
	
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordfield;
	public void enterpassword(String passwordText)
	{
		passwordfield.sendKeys(passwordText);
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	
	private WebElement loginButton;
	
	public AccountPage clickOnLoginButton()
	{
		loginButton.click();
		return new AccountPage(driver);
	}
	
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")
	private WebElement warningMessage;
	public String getWarningMessageText()
	{
		return warningMessage.getText();
	}

}
