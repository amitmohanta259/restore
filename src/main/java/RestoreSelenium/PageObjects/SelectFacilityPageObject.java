package RestoreSelenium.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RestoreSelenium.BasePackage.ReusableMethods;

public class SelectFacilityPageObject {
	WebDriver driver;
	ReusableMethods reusableMethod;
	public SelectFacilityPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		reusableMethod = new ReusableMethods();
		this.driver = driver;
	}
	
	@FindBy(xpath="//label[text()='Facilities']/following-sibling::div/input")
	WebElement facilityDropDown;
	
	
	public void selectFacility(String facilityName) throws InterruptedException {
		reusableMethod.explicitWait(driver, facilityDropDown);
		facilityDropDown.click();
		facilityDropDown.sendKeys(Keys.CLEAR);
		facilityDropDown.sendKeys(facilityName);
		facilityDropDown.sendKeys(Keys.DOWN);
		facilityDropDown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
}
