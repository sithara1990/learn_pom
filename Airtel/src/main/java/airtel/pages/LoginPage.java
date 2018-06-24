package airtel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import airtel.utilities.AirtelDriver;

public class LoginPage extends AirtelDriver  {
	//user xpath
	@FindBy(xpath="//input[@id='number-one']")
	public WebElement txtUsername;
	//password xpath
	@FindBy(id="pasword")
	public WebElement txtPassword;
	//submit xpath
	@FindBy(id="loginButtonSpan")
	public WebElement btnSubmit;
	
	
	
	public void login(){
		txtUsername.sendKeys("8977322332");
		txtPassword.sendKeys("xyz");
		btnSubmit.click();
		
	}

}
