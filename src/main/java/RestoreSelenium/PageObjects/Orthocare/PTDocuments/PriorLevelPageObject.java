package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriorLevelPageObject {
	WebDriver driver;
	public PriorLevelPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Prior Living Details Provided By 
	@FindBy(xpath="(//legend[@class='MuiFormLabel-root MuiFormLabel-colorPrimary Mui-required css-1q04fsw'])[1]")
	WebElement priorLivingDetails;
	
	
	@FindBy(xpath="(//legend[@class='MuiFormLabel-root MuiFormLabel-colorPrimary Mui-required css-1q04fsw'])[1]/following-sibling::div/div/label") 
	List<WebElement> priorLivingOptions; 
	
	//Prior Living Environment *
	@FindBy(xpath="//*[text()='Prior Living Environment']") 
	WebElement livingEnvironment;
	
	@FindBy(xpath="//*[text()='Prior Living Environment']/following-sibling::div/div/label") 
	List<WebElement> livingEnvironmentOptions;
	
	//------------------Prior Functioning & Prior Equipment Scoring ---------------------------------
	//Does the patient currently drive?
	@FindBy(xpath="//*[text()='Does the patient currently drive?']") 
	WebElement patientCurrentlyDrive; 
	
	@FindBy(xpath="//*[text()='Does the patient currently drive?']/following-sibling::div/div/label") 
	WebElement patientCurrentlyDriveYes;
	
	@FindBy(xpath="(//*[text()='Does the patient currently drive?']/following-sibling::div/div/label)[2]") 
	WebElement patientCurrentlyDriveNo;
	
	//Does the prior living environment require stairs? *
	@FindBy(xpath="//*[text()='Does the prior living environment require stairs?']") 
	WebElement livingEnvironmentRequireStairs; 
	
	@FindBy(xpath="//*[text()='Does the prior living environment require stairs?']/following-sibling::div/div/label")
	WebElement livingEnvironmentRequireStairsYes;
	
	@FindBy(xpath="(//*[text()='Does the prior living environment require stairs?']/following-sibling::div/div/label)[2]")
	WebElement livingEnvironmentRequireStairsNo;
	
	
	//-----------What floor is the patient's laundry room located?
	@FindBy(xpath="//legend[text()=\"What floor is the patient's laundry room located?\"]") 
	WebElement laundryRoomLocated;
	
	@FindBy(xpath="(//legend[normalize-space()=\"What floor is the patient's laundry room located?\"])[1]/following-sibling::div/div/label")
	List<WebElement> laundryRoomLocatedOptions; 
	
	//What floor is the patient's bedroom located?
	@FindBy(xpath="(//legend[normalize-space()=\"What floor is the patient's bedroom located?\"])[1]") 
	WebElement bedLocated; 
	
	//What floor is the bathroom where the patient performs showering/bathing located?
	@FindBy(xpath="(//legend[normalize-space()=\"What floor is the patient's bedroom located?\"])[1]/following-sibling::div/div/label") 
	List<WebElement> bedlocatedOptions; 
	
	//Patient's showering/bathing set up contains the following: (select all that apply)
	@FindBy(xpath="//legend[contains(text(),'What floor is the bathroom where the patient perfo')]") 
	WebElement patientShoweringBathing; 
	
	@FindBy(xpath="//legend[contains(text(),'What floor is the bathroom where the patient perfo')]/following-sibling::div/div/label")
	List<WebElement> patientShoweringBathingOptions;
	
	//Prior Device use (select all that apply) *
	@FindBy(xpath="//legend[text()='Prior Device use (select all that apply)']")
	WebElement priorDeviceUse; 
	
	//Prior Level Description
	@FindBy(xpath="//legend[text()='Prior Device use (select all that apply)']/following-sibling::div/div/label") 
	List<WebElement> priorDeviceUseOptions; 
	
	@FindBy(xpath="(//textarea[@id='#/properties/otherData/properties/priorLiving65-input'])[1]")
	WebElement priorLevelDescrption;
	
	//Prior Wheelchair Mobility *
	@FindBy(xpath="//legend[text()='Prior Wheelchair Mobility']")
	WebElement priorWheelChairMobility; 
	
	@FindBy(xpath="//legend[text()='Prior Wheelchair Mobility']/following-sibling::div/div/label")
	List<WebElement> priorWheelChairMobilityoptions;
	
	//Prior Indoor Mobility (ambulation) *
	@FindBy(xpath="//legend[text()='Prior Indoor Mobility (ambulation)']") 
	WebElement priorIndoorMobility; 
	
	@FindBy(xpath="//legend[text()='Prior Indoor Mobility (ambulation)']/following-sibling::div/div/label")
	List<WebElement> priorIndoorMobilityOptions;
	
	//Prior Functional Cognition
	@FindBy(xpath="//legend[text()='Prior Indoor Mobility (ambulation)']") 
	WebElement priorFunctionalCognition; 
	
	@FindBy(xpath="//legend[text()='Prior Indoor Mobility (ambulation)']/following-sibling::div/div/label")
	List<WebElement> priorFunctionalCognitionOption; 
	
	//Diet - Primary Source of Nutrition
	@FindBy(xpath="//legend[text()='Diet - Primary Source of Nutrition']") 
	WebElement primarySourceNutrition;
	
	@FindBy(xpath="//legend[text()='Diet - Primary Source of Nutrition']/following-sibling::div/div/label") 
	List<WebElement> primarySourceNutritionOptions; 
	
	//Diet Consistency - Food
	@FindBy(xpath="(//legend[normalize-space()='Diet Consistency - Food'])[1]") 
	WebElement dietConsistency;
	
	@FindBy(xpath="(//legend[normalize-space()='Diet Consistency - Food'])[1]/following-sibling::div/div/label") 
	List<WebElement> dietConsistencyOptions; 
	
	//Anticipated Discharge Plan *
	@FindBy(xpath="(//legend[normalize-space()='Anticipated Discharge Plan *'])[1]") 
	WebElement anticipatedDischargePlan;
	
	@FindBy(xpath="(//legend[normalize-space()='Anticipated Discharge Plan *'])[1]/following-sibling::div/div/label") 
	List<WebElement> anticipatedDischargePlanOption; 
	
	@FindBy(xpath="	//button[text()='Next']")
	WebElement nextButton;
	
	
	public void priorLevel() throws InterruptedException{
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorLivingDetails);
			Thread.sleep(1000);
			priorLivingOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", livingEnvironment);
			Thread.sleep(1000);
			livingEnvironmentOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientCurrentlyDrive);
			Thread.sleep(1000);
			patientCurrentlyDriveYes.click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", livingEnvironmentRequireStairs);
			Thread.sleep(1000);
			livingEnvironmentRequireStairsNo.click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", laundryRoomLocated);
			Thread.sleep(1000);
			laundryRoomLocatedOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		  
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bedLocated);
			Thread.sleep(1000);
			bedlocatedOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientShoweringBathing);
			Thread.sleep(1000);
			patientShoweringBathingOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorDeviceUse);
			Thread.sleep(1000);
			priorDeviceUseOptions.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorLevelDescrption);
			Thread.sleep(1000);
			priorLevelDescrption.click();
			priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorWheelChairMobility);
			Thread.sleep(1000);
			priorWheelChairMobilityoptions.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorIndoorMobility);
			Thread.sleep(1000);
			priorIndoorMobilityOptions.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priorFunctionalCognition);
			Thread.sleep(1000);
			priorFunctionalCognitionOption.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", primarySourceNutrition);
			Thread.sleep(1000);
			primarySourceNutritionOptions.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dietConsistency);
			Thread.sleep(1000);
			dietConsistencyOptions.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", anticipatedDischargePlan);
			Thread.sleep(1000);
			anticipatedDischargePlanOption.get(1).click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
			Thread.sleep(1000);
			nextButton.click();
			//priorLevelDescrption.sendKeys("Testing");
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	
		
		Thread.sleep(6000);
	}
	
	
}
