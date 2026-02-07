package RestoreSelenium.RestoreSkills;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RestoreSelenium.BasePackage.ReusableMethods;
import RestoreSelenium.PageObjects.AddNewEpisodeOfCarePageObject;

public class AddNewEpisodeOfCare extends BaseClass{
	AddNewEpisodeOfCarePageObject addNewEOC;
	ReusableMethods reusableMethod;
	
	@DataProvider(name="EocDetails")
	public Object[][] getEocDeatails() throws IOException{
		System.out.println("Inside Get EOC data");
		reusableMethod = new ReusableMethods<>();
		List<HashMap<Object, String>> eocData = reusableMethod.accessDataFromSheet("Create EOC", "Sheet2");
		Object[][] dataArray = new Object[eocData.size()][6];
		try {
			int i=0;
			for (HashMap<Object, String> dataSet : eocData) {
				dataArray[i][0] = dataSet.get("eocTitle").toString(); // episode title
	            dataArray[i][1] = dataSet.get("placeOfResidence").toString(); //place of residence 
	            dataArray[i][2] = dataSet.get("startCareDate").toString(); //start date
	            dataArray[i][3] = dataSet.get("mrn").toString(); //mrn
	            dataArray[i][4] = dataSet.get("payerTypeValue").toString(); //payer type
	            dataArray[i][5] = dataSet.get("payerValue").toString(); //payer
	           
				i++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		for (int i = 0; i < dataArray.length; i++) {
		    System.out.print("Row " + (i + 1) + ": ");
		    for (int j = 0; j < dataArray[i].length; j++) {
		        System.out.print("dataArray["+i+"]["+j+"]  "+dataArray[i][j].toString() + " ");
		    }
		    System.out.println(); // Move to the next row
		}
		
		return dataArray;
	}
	
	@Test(priority = 1, dataProvider = "EocDetails")
	public void createEOC(String eocTitle, String placeOfResidence, String startCareDate, String mrn, String payerTypeValue, String payerValue) throws InterruptedException {
		System.out.println("Inside create EOC");
		
		addNewEOC = new AddNewEpisodeOfCarePageObject(driver);
		addNewEOC.switchTab();
		addNewEOC.addNewEpisodeOfCare(eocTitle, placeOfResidence, "12/01/2024", mrn, payerTypeValue, payerValue);
		
		
	}
	
	
}
