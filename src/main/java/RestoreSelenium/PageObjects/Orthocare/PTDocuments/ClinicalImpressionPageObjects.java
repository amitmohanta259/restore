package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClinicalImpressionPageObjects {
	WebDriver driver;
	public ClinicalImpressionPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Following a comprehensive PT evaluation, patient presents with *
	@FindBy(xpath="//legend[text()='Following a comprehensive PT evaluation, patient presents with']")
	WebElement comprehensivePTEvaluation;
	
	//These findings indicate the need for targeted intervention to address *
	
	//Skilled PT services are warranted due to *
	
	//Without skilled intervention, the patient is at risk for the following *
	
	//Patient Barriers Likely to Impact Discharge *
	
	//Patient Characteristics Impacting Treatment *
	
	//Prognostic indicators for patient to meet expected outcomes
	
	
	//Patient prognosis to acheive goals *
	@FindBy(xpath="//legend[text()='Patient prognosis to acheive goals']")
	WebElement patientPrognosisAcheiveGoals;
	
	@FindBy(xpath="//legend[text()='Patient prognosis to acheive goals']/following-sibling::div/div/label")
	List<WebElement> patientPrognosisAcheiveGoalsOptions;
	//buttons 
	@FindBy(xpath="//button[text()='Next']")
	WebElement Next;
	
	
	public void patientPrognosisAcheiveGoalsInfo() throws InterruptedException {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientPrognosisAcheiveGoals);
			Thread.sleep(2000);
			patientPrognosisAcheiveGoalsOptions.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		Thread.sleep(2000);
	}
	
	
	public void navigate() throws InterruptedException {
		Next.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
}
