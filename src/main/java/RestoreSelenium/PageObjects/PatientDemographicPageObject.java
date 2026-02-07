package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientDemographicPageObject {
	WebDriver driver;
	public PatientDemographicPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[contains(text(),'male')]")
	WebElement gender;
	
	public void fetchGender()
	{
		gender.getText();
	}

}
