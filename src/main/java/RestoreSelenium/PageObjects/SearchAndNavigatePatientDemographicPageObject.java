package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndNavigatePatientDemographicPageObject {
	
	WebDriver driver;
	public  SearchAndNavigatePatientDemographicPageObject(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
     WebElement searchpatient;
	
	@FindBy(xpath="(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1wjjt5j'])[1]")
	WebElement clickOnPatient;
	
	
	
	
	public void searchPatientEmr() {
		searchpatient.sendKeys("Joseph Task");
	}
	
	public void clickOnPatient() throws InterruptedException {
		Thread.sleep(9000);
		clickOnPatient.click();
	}
	

}
