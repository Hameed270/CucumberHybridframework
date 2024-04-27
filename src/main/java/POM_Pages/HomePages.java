package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	
	
	WebDriver driver;
	public HomePages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountDropDown;
	
	public void clickOnMyAccount()
	{
		myAccountDropDown.click();
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	public LoginPage selectLoginOptions()
	{
		 loginOption.click();
		 return new LoginPage(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerOption;
	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}
	
	@FindBy(name="search")
	private WebElement searchBoxFiled;
	public void enterProductIntoSearchBox(String ProductText )
	{
		searchBoxFiled.sendKeys(ProductText);
	}
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	public SearchResultsPage clickOnSearchButton()
	{
		searchButton.click();
		return new SearchResultsPage(driver);
	}
}
