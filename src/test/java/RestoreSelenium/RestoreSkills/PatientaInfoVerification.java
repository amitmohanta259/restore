package RestoreSelenium.RestoreSkills;

import org.testng.annotations.Test;

import RestoreSelenium.PageObjects.PatientDemographicPageObject;

public class PatientaInfoVerification extends BaseClass {
	@Test(priority=1)
	public void infoGender()
	{
		PatientDemographicPageObject demographicObj=new PatientDemographicPageObject(driver);
		demographicObj.fetchGender();
		
	}

}
