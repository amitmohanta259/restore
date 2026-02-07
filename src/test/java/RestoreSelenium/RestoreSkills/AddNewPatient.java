package RestoreSelenium.RestoreSkills;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import RestoreSelenium.BasePackage.ReusableMethods;
import RestoreSelenium.PageObjects.AddNewPatientPageObject;

public class AddNewPatient extends BaseClass{
	AddNewPatientPageObject addNewPatientObj;
	ReusableMethods reusableMethod;
	Object[][] dataArray;
	
	@DataProvider(name = "patientDetails")
	public Object[][] getPatientDetails() throws IOException{
		System.out.println("Inside Get Patient Details Data Provider");
		reusableMethod = new ReusableMethods<>();
		List<HashMap<Object, String>> patientData = reusableMethod.accessDataFromSheet("1000 patient", "Sheet2");
		dataArray = new Object[patientData.size()][9];
		try {
			int i=0;
			for (HashMap<Object, String> dataSet : patientData) {
				dataArray[i][0] = dataSet.get("firstName").toString(); // First Name
	            dataArray[i][1] = dataSet.get("lastName").toString(); //Last Name
	            dataArray[i][2] = dataSet.get("gender").toString(); //gender
	            dataArray[i][3] = dataSet.get("dob").toString(); //dob
	            dataArray[i][4] = dataSet.get("primaryPhysician").toString(); //primaryPhysician
	            dataArray[i][5] = dataSet.get("MRN").toString(); //MRN
	            dataArray[i][6] = dataSet.get("SSN").toString(); //SSN
	            dataArray[i][7] = dataSet.get("PT_SLP").toString(); //PT+SLP
	            dataArray[i][8] = dataSet.get("OT").toString(); //OT
				i++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
//		for (int i = 0; i < dataArray.length; i++) {
//		    System.out.print("Row " + (i + 1) + ": ");
//		    for (int j = 0; j < dataArray[i].length; j++) {
//		        System.out.print("dataArray["+i+"]["+j+"]  "+dataArray[i][j].toString() + " ");
//		    }
//		    System.out.println(); // Move to the next row
//		}
		
		return dataArray;
	}
	
	@Test(priority = 1, dataProvider = "patientDetails")
	public void addNewPatient(String firstName, String lastName, String gender,String dob, String primaryPhysician, String MRN, String SSN, String PT_SLP, String OT ) throws InterruptedException, IOException {
		Random rand = new Random();
		reusableMethod = new ReusableMethods<>();
		System.out.println("Inside Add New Patient");		
		System.out.println(firstName+" "+lastName +" "+gender+" "+" "+dob+" "+primaryPhysician + MRN+" "+SSN+" "+PT_SLP+" "+OT );
		addNewPatientObj = new AddNewPatientPageObject(driver);
		addNewPatientObj.patientNavbarClick();
		Thread.sleep(5000);
		addNewPatientObj.provideDemograpicData(firstName, lastName, "9876543210", "amit"+rand.nextInt(4000)+"@gmail.com", MRN,SSN,dob,PT_SLP,OT);
		Thread.sleep(2000);
		addNewPatientObj.clickSave();
		reusableMethod.setPatientDataForSearch("Search Patient", "Sheet1",dataArray);
	}
}
