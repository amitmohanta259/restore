package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenuPageObject {
	WebDriver driver;
	public NavigationMenuPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Patients']")
	WebElement patientNavbar;
	
	@FindBy(xpath = "//*[@aria-label='Patients']")
	WebElement collapseViewPatientNavbar;
	
	
	public void patientNavbarClick() throws InterruptedException {
		Thread.sleep(5000);
		try {
			//patientNavbar.click();
			collapseViewPatientNavbar.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
}
