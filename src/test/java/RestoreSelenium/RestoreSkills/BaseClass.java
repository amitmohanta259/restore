package RestoreSelenium.RestoreSkills;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import RestoreSelenium.BasePackage.TestNgListners;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(TestNgListners.class)
public class BaseClass{
	static WebDriver driver;
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		try {
			FileReader reader=new FileReader("C:\\Users\\amit.mohanta\\Desktop\\Git Projects\\RestoreSelenium\\src\\main\\java\\RestoreSelenium\\Resource\\Configuration.properties");
	        Properties props=new Properties();
	        props.load(reader);
	        driver.get(props.getProperty("stageUrl"));
		}catch(Exception e) {
			System.out.println(e);
		}
		driver.get("https://orthocare-provider.stage-insights.restoreskills.com/patients/patient-details");
	}
	
	
//	@AfterTest
//	public void close() throws InterruptedException {
//		//Thread.sleep(2000);
//		//driver.close();
//	}
}
