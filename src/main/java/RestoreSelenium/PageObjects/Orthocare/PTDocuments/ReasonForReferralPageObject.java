package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForReferralPageObject {
	WebDriver driver;
	public ReasonForReferralPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	//Referred By *
	@FindBy(xpath="//legend[text()='Referred By']")
	WebElement referredBy;
	
	@FindBy(xpath="//legend[text()='Referred By']/following-sibling::div/div/label")
	List<WebElement> referredByOption;
	
	@FindBy(xpath="//*[@id='#/properties/otherData/properties/impactOn-input']")
	WebElement impactOnDailyActivity;
	
	@FindBy(xpath="(//input[@id='#/properties/patientData/properties/patientReferred'])[1]")
	WebElement patientReferredtoPhysician;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/finish429-input']")
	WebElement patientReferredtoPhysicianDescription;
	
	
	//Reason for Referral Summary Statement 
	@FindBy(xpath="//strong[text()='Reason for Referral Summary Statement']")
	WebElement ReasonForReferral;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/referralPreface']")
	WebElement ReasonForReferralQuestions;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/finish429-input']")
	WebElement ReasonForReferralDescrption;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement nextButton;
	
	public void addreasonForReferral() throws InterruptedException {
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", referredBy);
			Thread.sleep(1000);
			referredByOption.get(1).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", impactOnDailyActivity);
			impactOnDailyActivity.sendKeys("Testing");
			Thread.sleep(1000);
			patientReferredtoPhysician.click();
			patientReferredtoPhysician.sendKeys("Hospitalization");
			Thread.sleep(1000);
			//patientReferredtoPhysician.sendKeys(Keys.ARROW_DOWN);
			patientReferredtoPhysician.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReasonForReferral);
			Thread.sleep(1000);
			ReasonForReferralQuestions.click();
			ReasonForReferralQuestions.sendKeys("Patient referred to Physical Therapy");
			Thread.sleep(1000);
			ReasonForReferralQuestions.sendKeys(Keys.DOWN);
			ReasonForReferralQuestions.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			ReasonForReferralQuestions.click();
			ReasonForReferralDescrption.sendKeys("Testing");
			Thread.sleep(2000);
			nextButton.click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(4000);
	}
	
	
	
	
}
