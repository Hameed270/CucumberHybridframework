package stepdefinations;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM_Pages.AccountPage;
import POM_Pages.HomePages;
import POM_Pages.LoginPage;
import factory.Driverfactory;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import utils.CommonUtils;

public class Logins {
	
	WebDriver driver;
	private LoginPage loginpage;
	private AccountPage accountPage;
	private CommonUtils commonUtils;
	
	@Given("User navigates to login page")
	public void User_navigates_to_login_page()
	{   driver= Driverfactory.getdriver();
	
	HomePages homePage=new HomePages(driver);
	homePage.clickOnMyAccount();
	loginpage=homePage.selectLoginOptions();
	
		
		
		
		
	}
	@When("^User enters valid email address (.+) into email field$")
	public void User_enters_valid_email_address_into_email_field(String emailText)
	{
		
		loginpage.enterEmailAddress(emailText);
		
	}
	
	@And("^User enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String passwordText) 
	{
		loginpage.enterpassword(passwordText);
		
	}

	@And("User cliks on Login button")
	public void user_cliks_on_login_button() 
	
	{
		accountPage=loginpage.clickOnLoginButton();
		    
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() 
	{
	
		
	Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOption());    
	}

	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() 
	{
		loginpage=new LoginPage(driver);
		commonUtils=new CommonUtils();
		loginpage.enterEmailAddress(commonUtils.getTimeStampEmail());
		
	}

	@And("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidpasswordText) 
	{
		loginpage.enterpassword(invalidpasswordText);
		    
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() 
	{
	
		
	Assert.assertTrue(loginpage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));    
	}

	@When("User dont enter email address into  email field")
	public void user_dont_enter_email_address_into_email_field() 
	{
		
		loginpage.enterEmailAddress("");
		
	}

	@And("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() 
	{
		
		loginpage.enterpassword("");
		    
	}
	
	
	
	
	
}
