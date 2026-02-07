package RestoreSelenium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EpisodeOfCarePageObject {

		WebDriver driver;
		public EpisodeOfCarePageObject(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//button[normalize-space()='Episode of Care']")
		WebElement EpisodeOfCareLink;
		
		@FindBy(xpath = "//td[normalize-space()='OPENED']")
		WebElement selectOpenEOC;
		
		@FindBy(xpath = "//button[normalize-space()='Create New Document']")
		WebElement createNewDocument;
		
		@FindBy(xpath = "//div[@role='tooltip']//li[1]")
		WebElement createEval;
		
		@FindBy(xpath = "//button[contains(text(),'No, Don’t Clock-in.')]")
		WebElement clockInout;
		
		@FindBy(xpath = "//h5[normalize-space()='Would you like to Clock-In?']")
		WebElement popUpText;
		
		@FindBy(xpath = "//button[contains(text(),'No, Don’t Clock-in.')]")
		WebElement noDontClockInButton;
		
		public void clickEpisodeOfCare() {
			EpisodeOfCareLink.click();
		}
		
	
		public void selectOpenEOC() throws InterruptedException {
			selectOpenEOC.click();
			Thread.sleep(6000);
		}
		
		public void createNewDocument() throws InterruptedException {
			createNewDocument.click();
			Thread.sleep(6000);
		}
		
		public void createEval() throws InterruptedException {
			createEval.click();
			Thread.sleep(6000);
		}
		//need to move into usable method
		public void clockInOut() throws InterruptedException {
			System.out.println(popUpText.toString());
			Thread.sleep(5000);
			if(noDontClockInButton.isDisplayed()){
				noDontClockInButton.click();
			}
			Thread.sleep(5000);
		}
}
