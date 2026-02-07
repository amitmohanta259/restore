package RestoreSelenium.RestoreSkills;

import org.testng.annotations.Test;

import RestoreSelenium.PageObjects.Orthocare.PTDocuments.ClinicalImpressionPageObjects;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.GeneralInfoPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.InformedConcentPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.MedicalHistoryPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.ObjectiveAssessmentPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.PriorLevelPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.ReasonForReferralPageObject;
import RestoreSelenium.PageObjects.Orthocare.PTDocuments.TreatmentPlanPageObject;

public class CreateDocument extends BaseClass{
	
	GeneralInfoPageObject generalInfoPageObject;
	MedicalHistoryPageObject medicalHistoryPageObject;
	PriorLevelPageObject priorLevelPageObject;
	ReasonForReferralPageObject reasonForReferralPageObject;
	ObjectiveAssessmentPageObject objectiveAssessmentPageObject;
	ClinicalImpressionPageObjects clinicalImpressionPageObjects;
	TreatmentPlanPageObject treatmentPlanPageObject;
	InformedConcentPageObject informedConcentPageObject;
	@Test(priority = 1)
	public void CreateEval() throws InterruptedException {
		generalInfoPageObject = new GeneralInfoPageObject(driver);
		generalInfoPageObject.verifyDetails();
		medicalHistoryPageObject = new MedicalHistoryPageObject(driver);
		medicalHistoryPageObject.provideMedicalHistory("surgicalHistoryDescrptionValue","1", "String precautionsValue");
		priorLevelPageObject = new PriorLevelPageObject(driver);
		priorLevelPageObject.priorLevel();
		reasonForReferralPageObject = new ReasonForReferralPageObject(driver);
		reasonForReferralPageObject.addreasonForReferral();
		objectiveAssessmentPageObject = new ObjectiveAssessmentPageObject(driver);
		objectiveAssessmentPageObject.addObjectiveAssessment("30","30","30","30","vitalSignsCommentsValue");
		clinicalImpressionPageObjects = new ClinicalImpressionPageObjects(driver);
		clinicalImpressionPageObjects.patientPrognosisAcheiveGoalsInfo();
		clinicalImpressionPageObjects.navigate();
		treatmentPlanPageObject = new TreatmentPlanPageObject(driver);
		treatmentPlanPageObject.isEvalution();
		treatmentPlanPageObject.longTermGoal();
		treatmentPlanPageObject.frequencyIntervention();
		informedConcentPageObject = new InformedConcentPageObject(driver);
		informedConcentPageObject.fillInformConsentForm("Testing inform Consent");
	}
	
	
}