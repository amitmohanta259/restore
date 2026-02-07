package RestoreSelenium.PageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewEpisodeOfCarePageObject {

	WebDriver driver;
	public AddNewEpisodeOfCarePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[text()='Add New Episode of Care']")
	WebElement addNewEpisodeOfCareButton;
	
	@FindBy(xpath="//*[text()='Episode Title']/following-sibling::div/input")
	WebElement episodeTitle;
	
	@FindBy(xpath="//*[text()='Place of Residence']/following-sibling::div")
	WebElement placeOfResidenceInput;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation16 MuiPopover-paper css-1tz4swj']/ul/li")
	List<WebElement> placeOfResidenceOptions; 
	
	@FindBy(xpath="//*[text()='Start Date']/following-sibling::div/input")
	WebElement startDate;
	
	@FindBy(xpath="//*[text()='Payer Type']/following-sibling::div")
	WebElement payerType;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation16 MuiPopover-paper css-1tz4swj']/ul/li")
	List<WebElement> payTypeOptions;
	
	@FindBy(xpath="//*[text()='Payer']/following-sibling::div")
	WebElement payer;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation16 MuiPopover-paper css-1tz4swj']/ul/li")
	List<WebElement> payerOption;
	
	@FindBy(xpath="//button[text()='Episode of Care']")
	WebElement eocTab;
	
	@FindBy(xpath="//button[text()='Screening']")
	WebElement screeningTab;
	
	@FindBy(xpath="//button[text()='Info']")
	WebElement infoTab;
	
	@FindBy(xpath="//button[text()='MDS']")
	WebElement mdsTab;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveBtn;
	
	
	
	
	public void addNewEpisodeOfCare(String eocTitle, String placeOfResidence, String startCareDate, String mrn, String payerTypeValue, String payerValue) throws InterruptedException {
		System.out.println("inside add new Episode of care");
		Thread.sleep(2000);
		try {
			addNewEpisodeOfCareButton.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(3000);
		
		try {
			episodeTitle.sendKeys(eocTitle);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			Thread.sleep(2000);
			placeOfResidenceInput.click();
			Thread.sleep(1000);
			placeOfResidenceOptions.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(1000);
		try {
			String[] startDateString = startCareDate.split("/");
			startDate.click();
			startDate.sendKeys(startDateString[0]);
			startDate.sendKeys(startDateString[1]);
			startDate.sendKeys(startDateString[2]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(1000);
		
		try {
			payerType.click();
			Thread.sleep(1000);
			payTypeOptions.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		
		try {
			payer.click();
			Thread.sleep(1000);
			payerOption.get(1).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		Thread.sleep(2000);
		saveBtn.click();
		
	}
	
	public void switchTab(String tabName) throws InterruptedException {
		Thread.sleep(2000);
		eocTab.click();
		if(tabName == "Episode of Care") {
			eocTab.click();
		}
		if(tabName == "Screening") {
			screeningTab.click();
		}
		if(tabName == "Info") {
			infoTab.click();
		}
		if(tabName == "MDS") {
			mdsTab.click();
		}
		
	}
	public void switchTab() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Inside switchTab() ");
		eocTab.click();
		Thread.sleep(3000);
	}
	
}
