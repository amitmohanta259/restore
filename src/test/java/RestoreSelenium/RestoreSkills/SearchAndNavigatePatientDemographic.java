package RestoreSelenium.RestoreSkills;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RestoreSelenium.PageObjects.SearchAndNavigatePatientDemographicPageObject;

public class SearchAndNavigatePatientDemographic extends BaseClass{
	SearchAndNavigatePatientDemographicPageObject searchnavigateObj;
	@DataProvider(name = "getPatientSearchText")
	public Object[][] getExcelDataForPatientSearch(String filePath, String sheetName) {
		return null;
		
	}
	
	
	@Test(priority = 1)
	public void searchPatient() {
		searchnavigateObj = new SearchAndNavigatePatientDemographicPageObject(driver);
		searchnavigateObj.searchPatientEmr();
	}
	@Test(priority = 2)
	public void navigatePatientInfo() throws InterruptedException {
		searchnavigateObj.clickOnPatient();
		Thread.sleep(7000);
		
		
	}
	
}
