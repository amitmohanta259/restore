package RestoreSelenium.PageObjects.Orthocare.PTDocuments;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectiveAssessmentPageObject {
	WebDriver driver;
	
	public ObjectiveAssessmentPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//vital signs
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/heartRate-input']")
	WebElement heartRate;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/respiratoryRate-input']")
	WebElement RespiratoryRate;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/oxygenSaturation-input']")
	WebElement oxygenSaturation;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/bloodPressure-input']")
	WebElement bloodPressure;
	
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/vitalSignsComments-input']")
	WebElement vitalSignsComments;
	
	
	//Pain Assessment
	@FindBy(xpath="//p[text()='Pain Assessment']")
	WebElement painAssessment;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/assessmentMethod']")
	WebElement assessmentMethod; //enter value select the value and click in enter using sends keys 
	
	@FindBy(xpath="//legend[text()='Does the patient report or display symptoms pain?']")
	WebElement patientReportsSymptoms;
	
	@FindBy(xpath="//legend[text()='Does the patient report or display symptoms pain?']/following-sibling::div/div/label")
	List<WebElement> patientReportsSymptomsOptions; // Yes and No option
	
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/additionalComments-input']")
	WebElement additionalComments;
	
	//Fall Risk
	@FindBy(xpath="//p[text()='Fall Risk']")
	WebElement fallRisk;
	//--------Has the patient fallen in the past year? *
	@FindBy(xpath="//legend[text()='Has the patient fallen in the past year?']")
	List<WebElement> patientFallenPastYear;
		
	@FindBy(xpath="//legend[text()='Has the patient fallen in the past year?']/following-sibling::div/div/label")
	List<WebElement> patientFallenPastYearOption;
		
	//---------Does the patient feel unsteady when walking? *
	@FindBy(xpath="//legend[text()='Does the patient feel unsteady when walking?']")
	List<WebElement> patientFellUnsteadywhenWalking;
	
	@FindBy(xpath="//legend[text()='Does the patient feel unsteady when walking?']/following-sibling::div/div/label")
	List<WebElement> patientFellUnsteadywhenWalkingOptions;
	
	//----------------Does the patient feel unsteady when standing *
	
	@FindBy(xpath="//legend[text()='Does the patient feel unsteady when standing']")
	List<WebElement> patientFeelUnsteadyWhenStanding;
	
	@FindBy(xpath="//legend[text()='Does the patient feel unsteady when standing']/following-sibling::div/div/label")
	List<WebElement> patientFeelUnsteadyWhenStandingOption;
	
	//----------------Does the patient worry about falling? *
	@FindBy(xpath="//legend[text()='Does the patient worry about falling?']")
	List<WebElement> patientWorryAboutFalling;
	
	@FindBy(xpath="//legend[text()='Does the patient worry about falling?']/following-sibling::div/div/label")
	List<WebElement> patientWorryAboutFallingOption;
	
	//Bed Mobility
	@FindBy(xpath="//p[text()='Bed Mobility']")
	WebElement bedMobility;
	
	@FindBy(xpath="//p[text()='Roll left and right: The ability to roll from lying on back to left and right side, and return to lying on back on the bed.']")
	WebElement rollLeftRight;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel']")
	WebElement priorLevelLeftToRight;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel']")
	WebElement currentLevel; 
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments543-input']")
	WebElement additionalCommentsinput; 
	
	@FindBy(xpath="//input[@id='#/properties/goalData/properties/dischargeGoal']")
	WebElement dischargeGoal; 
	
	@FindBy(xpath="//p[text()='Sitting to lying: The ability to move from sitting on side of bed to lying flat on the bed.']")
	WebElement abilityToMoveFromSitting;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel544']")
	WebElement priorLevelSittingToLying;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel545']")
	WebElement currentLevelSittingToLying;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments547-input']")
	WebElement additionalCommentsSittingToLying;
	
	@FindBy(xpath="//input[@id='#/properties/goalData/properties/dischargeGoal546']")
	WebElement dischargeGoalSittingToLying;
	
	@FindBy(xpath="//p[text()='Lying to sitting on side of bed: The ability to move from lying on the back to sitting on the side of the bed and with no back support.']")
	WebElement lyingToSitting;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel561']")
	WebElement priorLevelLyingToSitting;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel562']")
	WebElement currentLevelLyingToSitting;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments564-input']")
	WebElement additionalCommentsLyingToSitting;
	
	@FindBy(xpath="//input[@id='#/properties/goalData/properties/dischargeGoal563']")
	WebElement dischargeGoalLyingToSitting;
	
	@FindBy(xpath="//legend[text()='Bed Mobility Equipment']")
	WebElement bedMobilityEquipment;
	
	@FindBy(xpath="//legend[text()='Bed Mobility Equipment']/following-sibling::div/div/label")
	List<WebElement> bedMobilityEquipmentOptions;
	
	@FindBy(xpath="//textarea[@id='#/properties/otherData/properties/additionalComments692-input']")
	WebElement bedMobilityEquipmentComment;
	
	//Transfer
	@FindBy(xpath="//p[text()='Transfers']")
	WebElement transfers;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel548']")
	WebElement priorLevelSitToStand;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel549']")
	WebElement currentLevelSitToStand;
	
	//Chair/bed-to-chair transfer: The ability to transfer to and from a bed to a chair (or wheelchair).
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel552']")
	WebElement priorLevelchairbedToChairTransfer;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel553']")
	WebElement currentLevelchairbedToChairTransfer;
	
	//Toilet transfer: The ability to get on and off a toilet or commode.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel556']")
	WebElement priorLevelgetOnandOffToilet;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel557']")
	WebElement currentLevelgetOnandOffToilet;
	
	//Tub/shower transfer: The ability to get in and out of a tub/shower.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel583']")
	WebElement priorLevelgetInandOutofTub;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel584']")
	WebElement currentLevelgetInandOutofTub;
	
	//Car transfer: The ability to transfer in and out of a car or van on the passenger side. Does not include the ability to open/close door or fasten seat belt.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel565']")
	WebElement priorLevelCarTransfer;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel566']")
	WebElement currentLevelCarTransfer;
	
	
	public void transfer() {
		
	}
	
	
	
	// 21st November
	//Ambulation
	@FindBy(xpath="//p[text()='Ambulation']")
	WebElement Ambulation;
	
	//---- Walk 10 feet: Once standing, the ability to walk at least 10 feet in a room, corridor, or similar space.
	@FindBy(xpath="//p[text()='Walk 10 feet: Once standing, the ability to walk at least 10 feet in a room, corridor, or similar space.']")
	WebElement walkAtleast10feet;
	
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel570']")
	WebElement priorLevelWalkTenfeet;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel571']")
	WebElement currentLevelWalTenFeet;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments573-input']")
	WebElement additionalCommentWalTenFeet;
	
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal572']")
	WebElement dischargeGoalWalTenFeet;
	
	
	
	//---- Walk 50 feet with two turns: Once standing, the ability to walk at least 50 feet and make two turns..
	@FindBy(xpath="//p[text()='Walk 50 feet with two turns: Once standing, the ability to walk at least 50 feet and make two turns.']")
	WebElement walkAtleast50feet;
		 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel574']")
	WebElement priorLevelWalk50feet;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel575']")
	WebElement currentLevelWalk50Feet;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments577-input']")
	WebElement additionalCommentWalk50Feet;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal576']")
	WebElement dischargeGoalWalk50Feet;
	
	
	//--- Walk 150 feet: Once standing, the ability to walk at least 150 feet in a corridor or similar space.
	@FindBy(xpath="//p[text()='Walk 150 feet: Once standing, the ability to walk at least 150 feet in a corridor or similar space.']")
	WebElement walkAtleast150feet;
		
		 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel578']")
	WebElement priorLevelWalk150feet;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel579']")
	WebElement currentLevelWalk150Feet;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments581-input']")
	WebElement additionalCommentWalk150Feet;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal580']")
	WebElement dischargeGoalWalk150Feet;
	
	
	//---- Walking 10 feet on uneven surfaces: The ability to walk 10 feet on uneven or sloping surfaces (indoor or outdoor), such as turf or gravel.
	@FindBy(xpath="//p[text()='Walking 10 feet on uneven surfaces: The ability to walk 10 feet on uneven or sloping surfaces (indoor or outdoor), such as turf or gravel.']")
	WebElement walkAtleast10feetOnUnevenSurfaceHeading;
		
		 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel588']")
	WebElement priorLevelwalkAtleast10feetOnUnevenSurface;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel589']")
	WebElement currentLevelwalkAtleast10feetOnUnevenSurface;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments591-input']")
	WebElement additionalCommentwalkAtleast10feetOnUnevenSurface;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal590']")
	WebElement dischargeGoalwalkAtleast10feetOnUnevenSurface;
	
	//Other Ambulation Tasks
	
	@FindBy(xpath="//p[text()='Other Ambulation Tasks']")
	WebElement otherAmbulationTasks;
	//--- 1 step (curb): The ability to go up and down a curb and/or up and down one step.
	@FindBy(xpath="//p[text()='1 step (curb): The ability to go up and down a curb and/or up and down one step.']")
	WebElement abilityToGoUpAndDown;
		
		 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel593']")
	WebElement priorLevelUpAndDown;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel594']")
	WebElement currentLevelUpandDown;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments596-input']")
	WebElement additionalCommentcurrentLevelUpandDown;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal595']")
	WebElement dischargeGoalLevelUpandDown;
	
	// 12 steps: The ability to go up and down four steps with or without a rail.']")
	
	@FindBy(xpath="//p[text()='12 steps: The ability to go up and down four steps with or without a rail.']")
	WebElement abilityToGoUpAndDown4SetpsWithoutRail;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel601']")
	WebElement priorLevelAbilityToGoUpAndDownFourStepWithoutRail;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel602']")
	WebElement currentLevelAbilityToGoUpAndDownFourStepWithoutRail;
	
	// Picking up object: The ability to bend/stoop from a standing position to pick up a small object, such as a spoon, from the floor.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel606']")
	WebElement priorLevelPickUpObeject;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel607']")
	WebElement currentLevelPickUpObeject;
	
	
	
	//---4 steps: The ability to go up and down four steps with or without a rail.
	
	@FindBy(xpath="//p[text()='4 steps: The ability to go up and down four steps with or without a rail.']")
	WebElement abilityToGoUpAndDown4steps;
			 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel597']")
	WebElement priorLevelUpAndDown4steps;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel598']")
	WebElement currentLevelUpandDown4steps;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments600-input']")
	WebElement additionalCommentcurrentLevelUpandDown4Steps;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal599']")
	WebElement dischargeGoalLevelUpandDown4Steps;
	
	
	//--- 12 steps: The ability to go up and down four steps with or without a rail.
	@FindBy(xpath="//p[text()='12 steps: The ability to go up and down four steps with or without a rail.']")
	WebElement abilityToGoUpAndDown12steps;
			 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel601']")
	WebElement priorLevelUpAndDown12steps;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel602']")
	WebElement currentLevelUpandDown12steps;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments604-input']")
	WebElement additionalCommentcurrentLevelUpandDown12Steps;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal603']")
	WebElement dischargeGoalLevelUpandDown12Steps;
	
	
	//--- Picking up object: The ability to bend/stoop from a standing position to pick up a small object, such as a spoon, from the floor.
	@FindBy(xpath="//p[text()='Picking up object: The ability to bend/stoop from a standing position to pick up a small object, such as a spoon, from the floor.']")
	WebElement abilityToBendStoop;
			 
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel606']")
	WebElement priorLevelabilityToBendStoop;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel607']")
	WebElement currentLevelabilityToBendStoop;
		
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments609-input']")
	WebElement additionalCommentabilityToBendStoop;
		
	@FindBy(xpath="//input[@id='//input[@id='#/properties/goalData/properties/dischargeGoal608']")
	WebElement dischargeGoalabilityToBendStoop;
	
	
//	//Other Ambulation Tasks Tab
//	@FindBy(xpath="//p[text()='Other Ambulation Tasks']")
//	WebElement otherAmbulationTaskTab;
//	
//	//-----1 step (curb): The ability to go up and down a curb and/or up and down one step.
//	@FindBy(xpath="//p[text()='1 step (curb): The ability to go up and down a curb and/or up and down one step.']")
//	WebElement abilityToGoUpandDown;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel593']")
//	WebElement priorLevelGoUpandDown;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel594']")
//	WebElement currentLevelGoUpandDown;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments596-input']")
//	WebElement commentGoUpandDown;
//	
//	
//	//-----4 steps: The ability to go up and down four steps with or without a rail.
//	@FindBy(xpath="//p[text()='4 steps: The ability to go up and down four steps with or without a rail.']")
//	WebElement abilityToGoUpandDownWithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel597']")
//	WebElement priorLevelGoUpandDownWithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel598']")
//	WebElement currentLevelGoUpandDownWithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments600-input']")
//	WebElement commentGoUpandDownWithWithoutRail;
//	
//	//-----12 steps: The ability to go up and down four steps with or without a rail.
//	@FindBy(xpath="//p[text()='12 steps: The ability to go up and down four steps with or without a rail.']")
//	WebElement abilityToGoUpandDown12WithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel601']")
//	WebElement priorLevelGoUpandDown12WithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel602']")
//	WebElement currentLevelGoUpandDown12WithWithoutRail;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments604-input']")
//	WebElement commentGoUpandDownWith12WithoutRail;
//	
//	//-----Picking up object: The ability to bend/stoop from a standing position to pick up a small object, such as a spoon, from the floor.
//	@FindBy(xpath="//p[text()='Picking up object: The ability to bend/stoop from a standing position to pick up a small object, such as a spoon, from the floor.']")
//	WebElement abilityTobendStoop;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel601']")
//	WebElement priorLevelabilityTobendStoop;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel602']")
//	WebElement currentLevelabilityTobendStoop;
//	
//	@FindBy(xpath="//input[@id='#/properties/otherData/properties/additionalComments604-input']")
//	WebElement commentabilityTobendStoop;
//	
//	
	//Wheelchair Mobility
	//--- Utilizes wheelchair and/or scooter *
	@FindBy(xpath="//p[text()='Wheelchair Mobility/Management']")
	WebElement wheelChairMobility;
	
	@FindBy(xpath="//legend[text()='Utilizes wheelchair and/or scooter']/following-sibling::div/div/label")
	List<WebElement> utilizeWheelChairOptions;
	
	//Wheel 50 feet with two turns: Once seated in wheelchair/scooter, the ability to wheel at least 50 feet and make two turns.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel610']")
	WebElement priorLevelWheel50FeetwithTwoTurns;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel611']")
	List<WebElement> currentLevelWheel50FeetwithTwoTurns;
	
	
	//---Indicate the type of wheelchair or scooter used
	@FindBy(xpath="//legend[text()='Indicate the type of wheelchair or scooter used']/following-sibling::div/div/label")
	List<WebElement> indicateWheelChairOptions;
	
	//Wheel 50 feet with two turns: Once seated in wheelchair/scooter, the ability to wheel at least 50 feet and make two turns.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel610']")
	WebElement priorLevelWheel50FeetWithTwoTurns;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel611']")
	WebElement currentLevelWheel50FeetWithTwoTurns;

	// Indicate the type of wheelchair or scooter used
	@FindBy(xpath="(//legend[text()='Indicate the type of wheelchair or scooter used'])[2]")
	WebElement indicateTypeOfWheelChairOrScoterTypeHeading;
	@FindBy(xpath="(//legend[text()=\"Indicate the type of wheelchair or scooter used\"])[2]/following-sibling::div/div/label")
	List<WebElement> indicateTypeOfWheelChairOrScotterUsedOptions;
	
	//Wheel 150 feet: Once seated in wheelchair/scooter, the ability to wheel at least 150 feet in a corridor or similar space.
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel615']")
	WebElement priorlevelWheel150Feet;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel616']")
	WebElement currentlevelWheel150Feet;
	
	
	@FindBy(xpath="//strong[text()='88. Not attempted due to medical condition or safety concerns']")
	WebElement notAttempted;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel610']")
	WebElement priorLevelWheel50FeetTwoTurns;
	
	@FindBy(xpath="//*[@id='#/properties/otherData/properties/priorLevel611']")
	WebElement currentLevelWheel50FeetTwoTurns;
	
	
	@FindBy(xpath="(//strong[text()='88. Not attempted due to medical condition or safety concerns'])[2]")
	WebElement notAttempted150;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/priorLevel615']")
	WebElement priorLevelWheel50Feet;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/currentLevel616']")
	WebElement currentLevelWheel50Feet;
	
	
	
	//Additional Mobility
	
	
	//Selfcare
	
	
	//Range of motion measurement 
	@FindBy(xpath="//p[text()='Range of Motion Measurements']")
	WebElement rangeMotionMeasurements;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/functionalLimitation767']")
	WebElement functionalLimitationUpperExtrimity;
	
	@FindBy(xpath="//input[@id='#/properties/otherData/properties/typeA768']")
	WebElement functionalLimitationLowerExtrimity;
	
	@FindBy(xpath="//legend[text()='Splint/Brace Recommended']")
	WebElement splintBraceRecomended;
	
	@FindBy(xpath="//legend[text()='Splint/Brace Recommended']/following-sibling::div/div/label")
	List<WebElement> splintBraceRecomendedOptions;
	
	
	
	// Strength Assessment 
	
	
	//Cognitive 
	@FindBy(xpath="//p[text()='Cognitive/Communication']")
	WebElement cognitiveCommunication;
	
	@FindBy(xpath="//legend[text()='Express Ideas, Wants, Needs']/following-sibling::div/div/label")
	List<WebElement> expressIdeasWantNeedsOptions;
	
	@FindBy(xpath="//legend[text()='Understand Others']/following-sibling::div/div/label")
	List<WebElement> understandOthersOptions;
	
	@FindBy(xpath="//legend[text()='Follows 1-Step Directions']/following-sibling::div/div/label")
	List<WebElement> followingStepDirectionOptions;
	
	@FindBy(xpath="//legend[text()='Decision making ability for routine activities']/following-sibling::div/div/label")
	List<WebElement> decisionMakingAbilityForRoutineOptions;
	
	
	//Other System
	
	
	//Objective Tests and Measure
	
	//buttons 
	@FindBy(xpath="//button[text()='Next']")
	WebElement Next;
	
	public void addObjectiveAssessment(String heartRateValue,String respiratoryRateValue, String oxygenSaturationValue, String bloodPressureValue, String vitalSignsCommentsValue) throws InterruptedException {
		heartRate.sendKeys(heartRateValue);
		RespiratoryRate.sendKeys(respiratoryRateValue);
		oxygenSaturation.sendKeys(oxygenSaturationValue);
		try {
			bloodPressure.sendKeys(bloodPressureValue);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", vitalSignsComments);
			vitalSignsComments.click();
			vitalSignsComments.sendKeys(vitalSignsCommentsValue);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", painAssessment);
			painAssessment.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", assessmentMethod);
			assessmentMethod.sendKeys("Verbal");
			Thread.sleep(1000);
			assessmentMethod.sendKeys(Keys.ARROW_DOWN);
			assessmentMethod.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientReportsSymptoms);
			patientReportsSymptomsOptions.get(1).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", additionalComments);
			additionalComments.click();
			additionalComments.sendKeys("Testing");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fallRisk);
			fallRisk.click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fallRisk);
			patientFallenPastYearOption.get(1).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", patientFallenPastYear);
			patientFellUnsteadywhenWalkingOptions.get(0).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		
		try {
			patientFeelUnsteadyWhenStandingOption.get(1).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			patientWorryAboutFallingOption.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bedMobility);
			bedMobility.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rollLeftRight);
			priorLevelLeftToRight.sendKeys("Independent");
			Thread.sleep(1000);
			priorLevelLeftToRight.sendKeys(Keys.ARROW_DOWN);
			priorLevelLeftToRight.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rollLeftRight);
			currentLevel.sendKeys("Independent");
			Thread.sleep(1000);
			currentLevel.sendKeys(Keys.ARROW_DOWN);
			currentLevel.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rollLeftRight);
			additionalCommentsinput.sendKeys("Independent");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rollLeftRight);
			dischargeGoal.sendKeys("Independent");
			Thread.sleep(1000);
			dischargeGoal.sendKeys(Keys.ARROW_DOWN);
			dischargeGoal.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abilityToMoveFromSitting);
			Thread.sleep(1000);
			priorLevelSittingToLying.sendKeys("Independent");
			Thread.sleep(1000);
			priorLevelSittingToLying.sendKeys(Keys.ARROW_DOWN);
			priorLevelSittingToLying.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			currentLevelSittingToLying.sendKeys("Independent");
			Thread.sleep(1000);
			currentLevelSittingToLying.sendKeys(Keys.ARROW_DOWN);
			currentLevelSittingToLying.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			additionalCommentsSittingToLying.sendKeys("Independent");
			Thread.sleep(1000);
			//currentLevelSittingToLying.sendKeys(Keys.ARROW_DOWN);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			dischargeGoalSittingToLying.sendKeys("Independent");
			Thread.sleep(1000);
			dischargeGoalSittingToLying.sendKeys(Keys.ARROW_DOWN);
			dischargeGoalSittingToLying.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lyingToSitting);
			Thread.sleep(1000);
			priorLevelLyingToSitting.sendKeys("Independent");
			Thread.sleep(1000);
			priorLevelLyingToSitting.sendKeys(Keys.ARROW_DOWN);
			priorLevelLyingToSitting.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			currentLevelLyingToSitting.sendKeys("Independent");
			Thread.sleep(1000);
			currentLevelLyingToSitting.sendKeys(Keys.ARROW_DOWN);
			currentLevelLyingToSitting.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			additionalCommentsLyingToSitting.sendKeys("Independent");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			dischargeGoalLyingToSitting.sendKeys("Independent");
			Thread.sleep(1000);
			dischargeGoalLyingToSitting.sendKeys(Keys.ARROW_DOWN);
			dischargeGoalLyingToSitting.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			bedMobilityEquipment.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			bedMobilityEquipmentOptions.get(1).click();
			Thread.sleep(1000);
			bedMobilityEquipmentComment.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		Thread.sleep(2000);
		//transfer -------------------code
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", transfers);
			Thread.sleep(1000);
			transfers.click();
			Thread.sleep(1000);
			priorLevelSitToStand.click();
			priorLevelSitToStand.sendKeys("ind");
			priorLevelSitToStand.sendKeys(Keys.ARROW_DOWN);
			priorLevelSitToStand.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelSitToStand.click();
			currentLevelSitToStand.sendKeys("ind");
			currentLevelSitToStand.sendKeys(Keys.ARROW_DOWN);
			currentLevelSitToStand.sendKeys(Keys.ENTER);
			//----------
			Thread.sleep(1000);
			priorLevelchairbedToChairTransfer.click();
			priorLevelchairbedToChairTransfer.sendKeys("ind");
			priorLevelchairbedToChairTransfer.sendKeys(Keys.ARROW_DOWN);
			priorLevelchairbedToChairTransfer.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelchairbedToChairTransfer.click();
			currentLevelchairbedToChairTransfer.sendKeys("ind");
			currentLevelchairbedToChairTransfer.sendKeys(Keys.ARROW_DOWN);
			currentLevelchairbedToChairTransfer.sendKeys(Keys.ENTER);
			//------------
			Thread.sleep(1000);
			priorLevelgetOnandOffToilet.click();
			priorLevelgetOnandOffToilet.sendKeys("ind");
			priorLevelgetOnandOffToilet.sendKeys(Keys.ARROW_DOWN);
			priorLevelgetOnandOffToilet.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			currentLevelgetOnandOffToilet.click();
			currentLevelgetOnandOffToilet.sendKeys("ind");
			currentLevelgetOnandOffToilet.sendKeys(Keys.ARROW_DOWN);
			currentLevelgetOnandOffToilet.sendKeys(Keys.ENTER);
			
			//----------------
			Thread.sleep(1000);
			priorLevelgetInandOutofTub.click();
			priorLevelgetInandOutofTub.sendKeys("ind");
			priorLevelgetInandOutofTub.sendKeys(Keys.ARROW_DOWN);
			priorLevelgetInandOutofTub.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			currentLevelgetInandOutofTub.click();
			currentLevelgetInandOutofTub.sendKeys("ind");
			currentLevelgetInandOutofTub.sendKeys(Keys.ARROW_DOWN);
			currentLevelgetInandOutofTub.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			priorLevelCarTransfer.click();
			priorLevelCarTransfer.sendKeys("ind");
			priorLevelCarTransfer.sendKeys(Keys.ARROW_DOWN);
			priorLevelCarTransfer.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			currentLevelCarTransfer.click();
			currentLevelCarTransfer.sendKeys("ind");
			currentLevelCarTransfer.sendKeys(Keys.ARROW_DOWN);
			currentLevelCarTransfer.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Ambulation);
			Thread.sleep(1000);
			Ambulation.click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", walkAtleast10feet);
			Thread.sleep(1000);
			priorLevelWalkTenfeet.sendKeys("Independ");
			priorLevelWalkTenfeet.sendKeys(Keys.DOWN);
			priorLevelWalkTenfeet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWalTenFeet.sendKeys("Independ");
			currentLevelWalTenFeet.sendKeys(Keys.DOWN);
			currentLevelWalTenFeet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentWalTenFeet.click();
			Thread.sleep(1000);
			additionalCommentWalTenFeet.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", walkAtleast50feet);
			Thread.sleep(1000);
			priorLevelWalk50feet.sendKeys("Independ");
			priorLevelWalk50feet.sendKeys(Keys.DOWN);
			priorLevelWalk50feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWalk50Feet.sendKeys("Independ");
			currentLevelWalk50Feet.sendKeys(Keys.DOWN);
			currentLevelWalk50Feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentWalk50Feet.click();
			Thread.sleep(1000);
			additionalCommentWalk50Feet.sendKeys("Testing");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abilityToGoUpAndDown4SetpsWithoutRail);
			Thread.sleep(1000);
			priorLevelWalk50feet.sendKeys("Independ");
			priorLevelWalk50feet.sendKeys(Keys.DOWN);
			priorLevelWalk50feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWalk50Feet.sendKeys("Independ");
			currentLevelWalk50Feet.sendKeys(Keys.DOWN);
			currentLevelWalk50Feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentWalk50Feet.click();
			Thread.sleep(1000);
			additionalCommentWalk50Feet.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", walkAtleast150feet);
			Thread.sleep(1000);
			priorLevelWalk150feet.sendKeys("Independ");
			priorLevelWalk150feet.sendKeys(Keys.DOWN);
			priorLevelWalk150feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWalk150Feet.sendKeys("Independ");
			currentLevelWalk150Feet.sendKeys(Keys.DOWN);
			currentLevelWalk150Feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentWalk150Feet.click();
			Thread.sleep(1000);
			additionalCommentWalk150Feet.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", walkAtleast10feetOnUnevenSurfaceHeading);
			Thread.sleep(1000);
			priorLevelwalkAtleast10feetOnUnevenSurface.sendKeys("Independ");
			priorLevelwalkAtleast10feetOnUnevenSurface.sendKeys(Keys.DOWN);
			priorLevelwalkAtleast10feetOnUnevenSurface.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelwalkAtleast10feetOnUnevenSurface.sendKeys("Independ");
			currentLevelwalkAtleast10feetOnUnevenSurface.sendKeys(Keys.DOWN);
			currentLevelwalkAtleast10feetOnUnevenSurface.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentwalkAtleast10feetOnUnevenSurface.click();
			Thread.sleep(1000);
			additionalCommentwalkAtleast10feetOnUnevenSurface.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", otherAmbulationTasks);
			Thread.sleep(1000);
			otherAmbulationTasks.click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abilityToGoUpAndDown);
			Thread.sleep(1000);
			priorLevelUpAndDown.sendKeys("Independ");
			priorLevelUpAndDown.sendKeys(Keys.DOWN);
			priorLevelUpAndDown.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelUpandDown.sendKeys("Independ");
			currentLevelUpandDown.sendKeys(Keys.DOWN);
			currentLevelUpandDown.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abilityToGoUpAndDown4steps);
			priorLevelUpAndDown4steps.sendKeys("Independ");
			priorLevelUpAndDown4steps.sendKeys(Keys.DOWN);
			priorLevelUpAndDown4steps.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelUpandDown4steps.sendKeys("Independ");
			currentLevelUpandDown4steps.sendKeys(Keys.DOWN);
			currentLevelUpandDown4steps.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			additionalCommentwalkAtleast10feetOnUnevenSurface.click();
			Thread.sleep(1000);
			additionalCommentwalkAtleast10feetOnUnevenSurface.sendKeys("Testing");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wheelChairMobility);
			priorLevelAbilityToGoUpAndDownFourStepWithoutRail.click();
			priorLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys("ind");
			priorLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys(Keys.ARROW_DOWN);
			priorLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			currentLevelAbilityToGoUpAndDownFourStepWithoutRail.click();
			currentLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys("ind");
			currentLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys(Keys.ARROW_DOWN);
			currentLevelAbilityToGoUpAndDownFourStepWithoutRail.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			priorLevelPickUpObeject.click();
			priorLevelPickUpObeject.sendKeys("Ind");
			priorLevelPickUpObeject.sendKeys(Keys.ARROW_DOWN);
			priorLevelPickUpObeject.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			currentLevelPickUpObeject.click();
			currentLevelPickUpObeject.sendKeys("Ind");
			currentLevelPickUpObeject.sendKeys(Keys.ARROW_DOWN);
			currentLevelPickUpObeject.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wheelChairMobility);
			Thread.sleep(1000);
			wheelChairMobility.click();
			utilizeWheelChairOptions.get(0).click();
			Thread.sleep(1000);
			indicateWheelChairOptions.get(0).click();
			Thread.sleep(1000);
			// -------------
			try {
				priorLevelWheel50FeetWithTwoTurns.click();
				priorLevelWheel50FeetWithTwoTurns.sendKeys("ind");
				priorLevelWheel50FeetwithTwoTurns.sendKeys(Keys.ARROW_DOWN);
				priorLevelWheel50FeetWithTwoTurns.sendKeys(Keys.ENTER);
				
				Thread.sleep(1000);
				currentLevelWheel50FeetWithTwoTurns.click();
				currentLevelWheel50FeetWithTwoTurns.sendKeys("ind");
				currentLevelWheel50FeetWithTwoTurns.sendKeys(Keys.ARROW_DOWN);
				currentLevelWheel50FeetWithTwoTurns.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", indicateTypeOfWheelChairOrScoterTypeHeading);
				indicateTypeOfWheelChairOrScotterUsedOptions.get(1).click();
				Thread.sleep(1000);
				priorlevelWheel150Feet.click();
				priorlevelWheel150Feet.sendKeys("ind");
				priorlevelWheel150Feet.sendKeys(Keys.ARROW_DOWN);
				priorlevelWheel150Feet.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				currentlevelWheel150Feet.click();
				currentlevelWheel150Feet.sendKeys("ind");
				currentlevelWheel150Feet.sendKeys(Keys.ARROW_DOWN);
				currentlevelWheel150Feet.sendKeys(Keys.ENTER);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", notAttempted);
			Thread.sleep(1000);
			priorLevelWheel50FeetTwoTurns.sendKeys("Independ");
			priorLevelWheel50FeetTwoTurns.sendKeys(Keys.DOWN);
			priorLevelWheel50FeetTwoTurns.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWheel50FeetTwoTurns.sendKeys("Independ");
			priorLevelWheel50FeetTwoTurns.sendKeys(Keys.DOWN);
			priorLevelWheel50FeetTwoTurns.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", notAttempted150);
			Thread.sleep(1000);
			priorLevelWheel50Feet.sendKeys("Independ");
			priorLevelWheel50Feet.sendKeys(Keys.DOWN);
			priorLevelWheel50Feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			currentLevelWheel50Feet.sendKeys("Independ");
			currentLevelWheel50Feet.sendKeys(Keys.DOWN);
			currentLevelWheel50Feet.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rangeMotionMeasurements);
			Thread.sleep(1000);
			rangeMotionMeasurements.click();
						//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", notAttempted);
			Thread.sleep(1000);
			functionalLimitationUpperExtrimity.sendKeys("Impair");
			functionalLimitationUpperExtrimity.sendKeys(Keys.DOWN);
			functionalLimitationUpperExtrimity.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			functionalLimitationLowerExtrimity.sendKeys("Impair");
			functionalLimitationLowerExtrimity.sendKeys(Keys.DOWN);
			functionalLimitationLowerExtrimity.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", splintBraceRecomended);
			Thread.sleep(1000);
			splintBraceRecomendedOptions.get(0).click();
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Thread.sleep(1000);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cognitiveCommunication);
			cognitiveCommunication.click();
			expressIdeasWantNeedsOptions.get(1).click();
			understandOthersOptions.get(1).click();
			followingStepDirectionOptions.get(0).click();
			decisionMakingAbilityForRoutineOptions.get(0).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Next.click();
		
		
		
		
		Thread.sleep(6000);
		
		
		
		
		
		
	}
	
}
