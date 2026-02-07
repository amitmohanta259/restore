package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformedConcentPageObject {
	WebDriver driver;
	public InformedConcentPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='#/properties/patientData/properties/patientfamilycaregiverEducation-input']")
	WebElement patientFamilycaregiverEducationInput;
	
	@FindBy(xpath="//legend[text()='Patient/Family/Caregiver education completed (select all that apply)']/following-sibling::div/div/label")
	List<WebElement> educationCompletedOption;
	
	@FindBy(xpath="//legend[text()='Patient/Family/Caregiver expressed understanding of evaluation and treatment plan']/following-sibling::div/div/label")
	List<WebElement> expressedUnderstandingEvaluationAndTreatmentPlan;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	public void fillInformConsentForm(String patientFamilycaregiverEducationValue) throws InterruptedException {
		try {
			patientFamilycaregiverEducationInput.sendKeys(patientFamilycaregiverEducationValue);
			Thread.sleep(1000);
			educationCompletedOption.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			Thread.sleep(4000);
			expressedUnderstandingEvaluationAndTreatmentPlan.get(1).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",submit );
			submit.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
