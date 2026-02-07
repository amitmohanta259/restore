package RestoreSelenium.RestoreSkills;

import RestoreSelenium.PageObjects.PatientInfoPageObject;

public class PatinetInfo extends BaseClass{
	PatientInfoPageObject patientInfo ;
	public void navigatePatientInfo() {
		patientInfo = new PatientInfoPageObject(driver);
		patientInfo.clickInfobutton();
	}
	
	public void verifyPatientInfo() {
		System.out.println("Inside VerifyPatientInfo");
	}
}
