package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='kc-login']")
	WebElement signIn;
	
	public void login(String user_name, String pass) {
		username.sendKeys(user_name);
		password.sendKeys(pass);
		signIn.click();
	}
	
}
