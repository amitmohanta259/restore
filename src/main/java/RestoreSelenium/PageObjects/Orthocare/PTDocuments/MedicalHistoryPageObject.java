package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalHistoryPageObject {
	WebDriver driver;
	public MedicalHistoryPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Pertinent Past Medical History as It Relates to Plan of Care (check all that apply)
	@FindBy(xpath="//*[text()='Pertinent Past Medical History as It Relates to Plan of Care (check all that apply)']/following-sibling::div/div")
	List<WebElement> patientPastMedicalHistory ;
	
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/surgicalHistory242-input']")
	WebElement surgicalHistoryDescrption;
	
	//Allergies (select all that apply)
	@FindBy(xpath="(//div[@class='MuiBox-root css-y6wp0m'])[2]/div/label/span")
	List<WebElement> allergies;
	
	// Previous Physical Therapy Treatment Interventions * 
	@FindBy(xpath="//legend[text()='Previous Physical Therapy Treatment Interventions']")
	WebElement physicaltherapyTreatmentInterventions;
	//Yes radio button
	@FindBy(xpath="(//legend[text()='Previous Physical Therapy Treatment Interventions']/following-sibling::div/div/label)[1]")
	WebElement previousPhysicalTherapyYes;
	
	@FindBy(xpath = "//input[@id='#/properties/otherData/properties/dateOf-input']")
	WebElement dateOfMostRecentDischarge;
	
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/commentsRegarding-input']")
	WebElement commentsRegardingPreviousPhysicalTherapyTreatment;
	//-----------------------------------
	//No radio button
	@FindBy(xpath="(//legend[text()='Previous Physical Therapy Treatment Interventions']/following-sibling::div/div/label)[2]")
	WebElement previousPhysicalTherapyNo;
	
	//Are there abnormal lab values that may impact function? *
	
	@FindBy(xpath="//legend[contains(text(),'Are there abnormal lab values that may impact func')]")
	WebElement abnormalLabValuesQuestion;
	
	@FindBy(xpath="(//input[@value='Yes'])[2]")
	WebElement abnormalLabValueYes;
	
	@FindBy(xpath="(//input[@value='No'])[2]")
	WebElement abnormalLabValueNo;
	
    //Pulmonary Status 	
	@FindBy(xpath="//legend[normalize-space()='Pulmonary Status']")
	WebElement pulmonaryStatusheading;
	
	@FindBy(xpath="(//fieldset[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[5]/div/div/label")
	List<WebElement> pulmonaryStatus;
	
	
	//Does patient require supplemental oxygen? *
	@FindBy(xpath="(//input[@value='Yes'])[3]")
	WebElement supplementalOxygenYes;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/numberOf']")
	WebElement oxygenLiters;
	
	@FindBy(xpath="//input[@value='No'])[3]")
	WebElement supplementalOxygenNo;
	
	//Precaution
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/precautions898-input']")
	WebElement precautions;
	
	//Directives / Code Status *
	@FindBy(xpath="//legend[text()='Directives / Code Status']")
	WebElement codeStatusHeading;
	
	@FindBy(xpath="//legend[text()='Directives / Code Status']/following-sibling::div/div/label")  
	List<WebElement> codeStatusOption;
	
	
	//Hand Dominance *
	@FindBy(xpath="//legend[text()='Hand Dominance']")
	WebElement handDominance;
	
	@FindBy(xpath="//legend[text()='Hand Dominance']/following-sibling::div/div/label")
	List<WebElement> handDominanceOptions;
	
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement next;
	
	//-------------------------------------Patient Factor Section------------------------------------------------------------ 
	
	public void provideMedicalHistory(String surgicalHistoryDescrptionValue,String oxygenLitersValue, String precautionsValue) throws InterruptedException {
		Thread.sleep(2000);
		
		try {
			patientPastMedicalHistory.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", surgicalHistoryDescrption);
			Thread.sleep(1000);
			surgicalHistoryDescrption.click();
			Thread.sleep(2000);
			surgicalHistoryDescrption.sendKeys(surgicalHistoryDescrptionValue);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allergies);
			Thread.sleep(1000);
			allergies.get(1).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", previousPhysicalTherapyNo);
			Thread.sleep(1000);
			previousPhysicalTherapyNo.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abnormalLabValuesQuestion);
			Thread.sleep(2000);
			abnormalLabValueNo.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pulmonaryStatusheading);
			Thread.sleep(1000);
			pulmonaryStatus.get(1).click();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", supplementalOxygenYes);
			Thread.sleep(1000);
			supplementalOxygenYes.click();
			Thread.sleep(2000);
			oxygenLiters.sendKeys(oxygenLitersValue);
			oxygenLiters.sendKeys(Keys.ENTER);;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", precautions);
			Thread.sleep(1000);
			precautions.click();
			precautions.sendKeys(precautionsValue);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", codeStatusHeading);
			Thread.sleep(1000);
			codeStatusOption.get(2).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", handDominance);
			Thread.sleep(1000);
			handDominanceOptions.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", next);
			Thread.sleep(1000);
			next.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(6000);

		
	}
}
