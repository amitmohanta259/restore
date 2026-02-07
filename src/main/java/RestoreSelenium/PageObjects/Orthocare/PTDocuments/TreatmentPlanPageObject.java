package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreatmentPlanPageObject {
	WebDriver driver;
	public TreatmentPlanPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Was this an evaluation only and no further treatment is indicated?']/following-sibling::div/div/label")
	List<WebElement> isEvaluationOnlyOptions;
	
	@FindBy(xpath="//button[@aria-label='Add to Short-Term Goals']")
	WebElement shortTermAddButton;
	
	@FindBy(xpath="//input[@id='#/properties/skill']")
	WebElement goals;
	
	@FindBy(xpath="//textarea[@id='#/properties/goal-input']")
	WebElement goalsComment;
	
	@FindBy(xpath="//textarea[@id='#/properties/skilledComments-input']")
	WebElement skilledComments;
	
	@FindBy(xpath="//input[@id='#/properties/priorLevel-input']")
	WebElement priorLevelFunction;
	
	@FindBy(xpath="//input[@id='#/properties/currentLevel-input']")
	WebElement currentLevelFunction;
	//
	@FindBy(xpath="//input[@id='#/properties/completeBy-input']")
	WebElement shortTermCompletedBy;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5']")
	WebElement calenderIcon;
	
	@FindBy(xpath="//button[text()='17']")
	WebElement date;
	
	public void isEvalution() throws InterruptedException {
		try {
			isEvaluationOnlyOptions.get(1).click();
			shortTermAddButton.click();
			goals.click();
			goals.sendKeys(Keys.ARROW_DOWN);
			goals.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			goalsComment.sendKeys("Testing");
			skilledComments.sendKeys("Skilled Comments");
			priorLevelFunction.sendKeys("Testing");
			currentLevelFunction.sendKeys("Testing");
			Thread.sleep(1000);
			calenderIcon.click();
			date.click();
			Thread.sleep(4000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	
	//Long Term Goal
	@FindBy(xpath="//button[@aria-label='Add to Long-Term Goals']")
	WebElement longTermAddButton;
	
	@FindBy(xpath="//input[@id='#/properties/skill2']")
	WebElement longTermGoals;
	
	@FindBy(xpath="//textarea[@id='#/properties/goal2-input']")
	WebElement longTermGoalComment;
	
	@FindBy(xpath="//textarea[@id='#/properties/skilledComments2-input']")
	WebElement longTermSkillsComment;
	
	@FindBy(xpath="//input[@id='#/properties/priorLevel2-input']")
	WebElement longTermPriorLevelFunction;
	
	@FindBy(xpath="//input[@id='#/properties/currentLevel2-input']")
	WebElement LongTermCurrentLevelFunction;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5'])[2]")
	WebElement longTermCalender;
	
	@FindBy(xpath="(//button[text()='18'])")
	WebElement dateSelection;
	
	
	public void longTermGoal() throws InterruptedException {
		Thread.sleep(1000);
		longTermAddButton.click();
		longTermGoals.click();
		longTermGoals.sendKeys(Keys.ARROW_DOWN);
		longTermGoals.sendKeys(Keys.ENTER);
		longTermGoalComment.sendKeys("Testing Goals");
		longTermSkillsComment.sendKeys("Testing");
		longTermPriorLevelFunction.sendKeys("Prior Level Function");
		LongTermCurrentLevelFunction.sendKeys("Current Level Function");
		longTermCalender.click();
		Thread.sleep(1000);
		dateSelection.click();
		Thread.sleep(5000);
	}
	
	
	@FindBy(xpath="//p[text()='Frequency & Interventions']")
	WebElement frequencyIntervention;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/frequency243']")
	WebElement frequencySelection;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/frequencyValue']")
	WebElement frequencyValue;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/duration-input']")
	WebElement duration;
	
//	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5'])[1]")
//	WebElement startDateCalender;
//	
//	@FindBy(xpath="//button[text()='19']")
//	WebElement startDate;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5'])[2]")
	WebElement thruDateCalender;
	
	@FindBy(xpath="//button[text()='20']")
	WebElement thruDate;
	
	
	@FindBy(xpath="//legend[text()='Recommended Modes of Treatment']/following-sibling::div/div/label")
	List<WebElement> modeOfTreatmentOptions;
	
	@FindBy(xpath="//legend[text()='ICD10 Medical Codes']")
	WebElement icdMedicalCode;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/ICD10TMedicalCodes-search']")
	WebElement icdMedicalCodeInput;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding MuiList-dense css-1ontqvh']/li")
	List<WebElement> icdCptCodeInputOptions;
	
	@FindBy(xpath="//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeSmall PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeSmall MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeSmall css-1jci4w9']/input")
	WebElement isPrimary;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5'])[3]")
	WebElement icdMedicalCalender;
	
	
	@FindBy(xpath="//button[text()='20']")
	WebElement dateSelected;
	
	@FindBy(xpath="//legend[text()='ICD10 Treatment Codes']")
	WebElement icdTreatmentCode;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/ICD10TreatmentCodes-search']")
	WebElement icdTreatmentCodeInput;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1e7fbl5'])[4]")
	WebElement icdtreatmentCalender;
	
	@FindBy(xpath="//legend[text()='CPT Codes']")
	WebElement cptCode;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/cptCodes-search']")
	WebElement cptCodeInput;
	
	//buttons 
		@FindBy(xpath="//button[text()='Next']")
		WebElement next;
	
	public void frequencyIntervention() throws InterruptedException{
		try {
			frequencyIntervention.click();
			Thread.sleep(1000);
			frequencySelection.click();
			frequencySelection.sendKeys("days");
			frequencySelection.sendKeys(Keys.ARROW_DOWN);
			frequencySelection.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			frequencyValue.click();
			frequencyValue.sendKeys(Keys.ARROW_DOWN);
			frequencyValue.sendKeys(Keys.ENTER);
			duration.sendKeys("45 mins");
			thruDateCalender.click();
			thruDate.click();
			modeOfTreatmentOptions.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",icdMedicalCode );
			icdMedicalCodeInput.sendKeys("23");
			Thread.sleep(6000);
			icdCptCodeInputOptions.get(1).click();
			Thread.sleep(1000);
			isPrimary.click();
			icdMedicalCalender.click();
			dateSelected.click();
			Thread.sleep(4000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",icdTreatmentCode );
			icdTreatmentCode.click();
			icdTreatmentCodeInput.sendKeys("14");
			Thread.sleep(6000);
			icdCptCodeInputOptions.get(1).click();
			Thread.sleep(1000);
			icdtreatmentCalender.click();
			dateSelected.click();
			Thread.sleep(4000);
			cptCodeInput.click();
			cptCodeInput.sendKeys("97161");
			Thread.sleep(6000);
			icdCptCodeInputOptions.get(0).click();
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",next );
		next.click();
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	
}
