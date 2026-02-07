package RestoreSelenium.RestoreSkills;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RestoreSelenium.BasePackage.ReusableMethods;
import RestoreSelenium.PageObjects.AddNewPatientPageObject;
import RestoreSelenium.PageObjects.LoginPageObject;
import RestoreSelenium.PageObjects.NavigationMenuPageObject;

public class Login<E> extends BaseClass{
	ReusableMethods reusableMethod;
	SelectFacility selectFacility; 
	@DataProvider(name = "loginCreds")
	public Object[][] getLoginCreds() throws IOException {
		reusableMethod = new ReusableMethods<>();
        List<HashMap<String, String>> data = reusableMethod.accessDataFromSheet("Login Creds", "Therapist");
        // Convert List of Lists to a 2D Object array
        Object[][] dataArray = new Object[data.size()][2];
        for (HashMap<String, String> dataSet : data) {
			int i = 0;
			dataArray[i][0] = dataSet.get("Username"); // Username
            dataArray[i][1] = dataSet.get("Password"); // Password
		}
        return dataArray;
	}
	@Test(priority = 1, dataProvider = "loginCreds" )
	public void login(String Username, String Password) {
		LoginPageObject loginObj = new LoginPageObject(driver);
		loginObj.login(Username,Password);
	}
	
	@Test(priority = 2)
	public void menuSelection() throws InterruptedException {
		System.out.println("Inside menu selection");
		NavigationMenuPageObject navObj = new NavigationMenuPageObject(driver);
		navObj.patientNavbarClick();
		//Thread.sleep(5000);
	}
}
