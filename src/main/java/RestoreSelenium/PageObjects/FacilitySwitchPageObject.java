package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilitySwitchPageObject {
	WebDriver driver;
	public FacilitySwitchPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[name()='path'])[4]")
	WebElement facilityDropdown;
	
	
	
}
