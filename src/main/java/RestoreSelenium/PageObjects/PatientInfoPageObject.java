package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientInfoPageObject {
	WebDriver driver;
	public PatientInfoPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Info']")
	WebElement infoLink;
	
	
	public void clickInfobutton() {
		infoLink.click();
	}
}
