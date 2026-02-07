package RestoreSelenium.RestoreSkills;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import RestoreSelenium.BasePackage.ReusableMethods;
import RestoreSelenium.PageObjects.SelectFacilityPageObject;

public class SelectFacility extends BaseClass{
	SelectFacilityPageObject selectFaciltityPO;
	ReusableMethods reusableMethod;
	public Object[][] getFacilityName() throws IOException {
		reusableMethod = new ReusableMethods<>();
        List<HashMap<String, String>> data = reusableMethod.accessDataFromSheet("Login Creds", "Therapist");
        // Convert List of Lists to a 2D Object array
        Object[][] dataArray = new Object[data.size()][3];
        for (HashMap<String, String> dataSet : data) {
			int i = 0;
			dataArray[i][0] = dataSet.get("Username"); // Username
            dataArray[i][1] = dataSet.get("Password"); // Password
            dataArray[i][1] = dataSet.get("Discipline");
		}
        return dataArray;
	}
	@Test
	public void selectFacility(String Discipline) throws InterruptedException {
		System.out.println("Inside select facility");
		selectFaciltityPO = new SelectFacilityPageObject(driver);
		if(Discipline.isBlank()) {
			Discipline = "Sandbox";
			selectFaciltityPO.selectFacility(Discipline);
			System.out.println(Discipline);
		}else {
			selectFaciltityPO.selectFacility(Discipline);
			System.out.println(Discipline);
		}
		
	}
}
