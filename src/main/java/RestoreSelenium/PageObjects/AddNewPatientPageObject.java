package RestoreSelenium.PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import RestoreSelenium.BasePackage.ReusableMethods;
import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class AddNewPatientPageObject {

	
	WebDriver driver;
	NavigationMenuPageObject navObj;
	ReusableMethods reusableMethod;
	public AddNewPatientPageObject(WebDriver driver) {
			PageFactory.initElements(driver, this);
			navObj = new NavigationMenuPageObject(driver);
			reusableMethod = new ReusableMethods();
			this.driver = driver;
	}
	
	
	//WebElement patientNav = driver.findElement(By.xpath());
	
	@FindBy(xpath = "//button[text()='Add New Patient']")
	WebElement addNewPatient;
	
	@FindBy(xpath= "//div[text()='Add New Patient']")
	WebElement addNewPatientLink;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//label[text()='Gender']/following-sibling::div/div")
	WebElement gender;
	
	@FindBy(xpath="//li[@role='option']")
	List<WebElement> genderOptions; 
	
	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-adornedEnd css-p8r566']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd css-1vyoetn']")
	WebElement enterDOB;
	
	@FindBy(xpath="//input[@name='patientPhoneNo']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='patientEmail']")
	WebElement email;
	
	@FindBy(xpath="//label[text()='Primary Physician']/following-sibling::div/input")
	WebElement primaryPhysician;
	
	@FindBy(xpath="//ul[@id=':rq:-listbox']/li")
	List<WebElement> physicianList; 
	
	@FindBy(xpath="//input[@name='bedAssignment']")
	WebElement bedAssignment;
	
	@FindBy(xpath="//input[@name='medicalRecordNumber']")
	WebElement mrn;
	
	@FindBy(xpath="//input[@name='socialSecurityNumber']")
	WebElement ssn;
	
	@FindBy(xpath="//label[text()='PT+SLP ($)']/parent::div/div/input")
	WebElement pt_slp;
	
	@FindBy(xpath="//label[text()='OT ($)']/parent::div/div/input")
	WebElement ot;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//*[text()='Back to Patient List']")
	WebElement backButton;
	
	@FindBy(xpath = "")
	WebElement ssnAlertMessage;
	
	@FindBy(xpath = "")
	WebElement mrnAlertMessage;
	
	@FindBy(xpath = "")
	WebElement successAndFailureMessage;
	
	public void patientNavbarClick() throws InterruptedException {
		navObj.patientNavbarClick();
		addNewPatient.click();
		addNewPatientLink.click();
	}
	
	public void provideDemograpicData(String firstname, String lastname, String phonenumber, String emailId, String mrnNumber, String ssnNumber, String dob, String PT_SLP, String OT) {
		try {
			firstName.sendKeys(firstname);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			lastName.sendKeys(lastname);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			dateOfBirth.click();
			String[] dobString = dob.split("/");
			enterDOB.sendKeys(dobString[0]);
			enterDOB.sendKeys(dobString[1]);
			enterDOB.sendKeys(dobString[2]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			//Thread.sleep(1000);
			reusableMethod.explicitWait(driver, gender);
			gender.click();
			//Thread.sleep(2000);
			reusableMethod.explicitWait(driver, genderOptions.get(0));
			genderOptions.get(0).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			phoneNumber.sendKeys(phonenumber);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			email.sendKeys(emailId);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", primaryPhysician);
			primaryPhysician.click();
			//Thread.sleep(3000);
			reusableMethod.explicitWait(driver, primaryPhysician);
			primaryPhysician.sendKeys("Amit");
			//Thread.sleep(2000);
			reusableMethod.explicitWait(driver, primaryPhysician);
			primaryPhysician.sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(1000);
			reusableMethod.explicitWait(driver, primaryPhysician);
			primaryPhysician.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			reusableMethod.explicitWait(driver, mrn);
			mrn.sendKeys(mrnNumber);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			reusableMethod.explicitWait(driver, ssn);
			ssn.sendKeys(ssnNumber);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			reusableMethod.explicitWait(driver, pt_slp);
			pt_slp.sendKeys(PT_SLP);
//			Thread.sleep(1000);
			reusableMethod.explicitWait(driver, ot);
			ot.sendKeys(OT);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public void clickSave() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		reusableMethod.explicitWait(driver, saveButton);
		saveButton.click();
		Thread.sleep(20000);

	}
	
	
}
