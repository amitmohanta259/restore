package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientSearchDemographics {

	
	WebDriver driver;
	public PatientSearchDemographics(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement SearchBar;
	
	public void searchPatient() {
		SearchBar.sendKeys("5500");
	}
}

