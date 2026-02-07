package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInfoPageObject {
	WebDriver driver;
	public GeneralInfoPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/therapistFirstName-input']")
	WebElement firstName;
	
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/therapistLastName-input']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/licenseNumber-input']")
	WebElement licenseNo;
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/credentials-input']")
	WebElement cedrentials;
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/siteOfService-input']")
	WebElement siteOfService;
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/dateOfService-input']")
	WebElement dos;
	
	@FindBy(xpath = "//input[@id='#/properties/patientData/properties/patientFirstName-input']")
	WebElement patientFirstName;
	
	@FindBy(xpath="//input[@id='#/properties/patientData/properties/patientLastName-input']")
	WebElement patientLastName;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/dateOfBirth-input']")
	WebElement dob;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/mrn-input']")
	WebElement mrn;
	
	@FindBy(xpath="//input[@id='#/properties/certificateData/properties/startOfCareDate-input']")
	WebElement startOfCare;
	
	@FindBy(xpath="//input[@id='#/properties/physicianData/properties/physicianName-input']")
	WebElement physicianName;
	
	@FindBy(xpath="//button[normalize-space()='Next - Medical History & Patient Factors']")
	WebElement nextButton;
	
	@FindBy(xpath="//span[normalize-space()='Patient']")
	WebElement patientHeading;
	
	@FindBy(xpath="//span[normalize-space()='Physician']")
	WebElement physicianHeading;
	
	
	//data verification need to be performed 
	public void verifyDetails() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Testing");
		System.out.println(firstName.getAttribute("value") + " " + lastName.getAttribute("value") + " " +licenseNo.getAttribute("value")+" "+cedrentials.getAttribute("value")+" "+siteOfService.getAttribute("value")+" "+dos.getAttribute("value"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientHeading);
		System.out.println(patientFirstName.getAttribute("value") + " " + patientLastName.getAttribute("value") + " " +dob.getAttribute("value")+" "+mrn.getAttribute("value")+" "+startOfCare.getAttribute("value"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", physicianHeading);
		System.out.println(physicianName.getAttribute("value"));
		nextButton.click();
	}
	
	
	
}
