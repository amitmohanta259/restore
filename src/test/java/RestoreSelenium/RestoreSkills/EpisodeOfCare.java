package RestoreSelenium.RestoreSkills;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import RestoreSelenium.PageObjects.EpisodeOfCarePageObject;

public class EpisodeOfCare extends BaseClass{
	EpisodeOfCarePageObject EpisodeOfCarePageObj;
	@Test(priority = 1)
	public void navigateToOpenEval() throws InterruptedException {
		
		EpisodeOfCarePageObj = new EpisodeOfCarePageObject(driver);
		EpisodeOfCarePageObj.clickEpisodeOfCare();
		EpisodeOfCarePageObj.selectOpenEOC();
		EpisodeOfCarePageObj.createNewDocument();
		EpisodeOfCarePageObj.createEval();
		EpisodeOfCarePageObj.clockInOut();
	
	}
}
