package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	public void enterFirstName(String firstNameText) {
		firstNameField.sendKeys(firstNameText);
	}
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	public void enterLastNameField(String lastNameText) {
		lastNameField.sendKeys(lastNameText);
	}
	@FindBy(id = "input-email")
	private WebElement emailField;
	public void enterEmailField(String emailText) {
		emailField.sendKeys(emailText);
	}
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	public void enterTelephoneField(String telephoneText) {
		telephoneField.sendKeys(telephoneText);
	}
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	public void enterPasswordField(String passwordText) {
		passwordField.sendKeys(passwordText);
	}
	
	@FindBy(id = "input-confirm")
	private WebElement passwordConfirmField;
	public void enterPasswordConfirmField(String passwordConfirmText) {
		passwordConfirmField.sendKeys(passwordConfirmText);
	}
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyOption;
	public void selectPrivacyPolicy() {
		privacyPolicyOption.click();
	}
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	public AccountSuccessPage clickOnContinueButton() {
		continueButton.click();
		return new AccountSuccessPage(driver);
	}
	
	@FindBy(xpath = "//input[@name='newsletter'][@value='1']")
	private WebElement yesToNewsLetterOption;
	public void selectYesToNewsLetterOption() {
		yesToNewsLetterOption.click();
	}
	
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	private WebElement warningMessage;
	public String getWarningMessageText() {
		return warningMessage.getText();
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameWarning;
	public String getFirsdtNameWarningText() {
		return firstNameWarning.getText();
	}
	@FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameWarning;
	public String getLastNameWarningText() {
		return lastNameWarning.getText();
	}
	@FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
	private WebElement emailWarning;
	public String getEmailWarningText() {
		return emailWarning.getText();
	}
	@FindBy(xpath = "//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWarning;
	public String getTelephoneWarningText() {
		return telephoneWarning.getText();
	}
	@FindBy(xpath = "//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWarning;
	public String getPasswordWarningText() {
		return passwordWarning.getText();
	}
}

