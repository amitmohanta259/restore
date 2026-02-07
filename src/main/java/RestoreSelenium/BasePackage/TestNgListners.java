package RestoreSelenium.BasePackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListners implements ITestListener{

	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
        startRecording(); // Start recording when the test starts
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Ended: " + result.getName() + " - Status: PASSED");
        stopRecording(false, null); // Stop recording without saving
        System.out.println("============================================");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Ended: " + result.getName() + " - Status: FAILED");
        stopRecording(true, result.getTestClass().getName()); // Stop recording and save
        System.out.println("============================================");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
        System.out.println("============================================");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
        System.out.println("============================================");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Execution Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Execution Finished: " + context.getName());
    }

    private void startRecording() {
        // Implement the logic to start screen recording
        System.out.println("Recording started...");
    }

    private void stopRecording(boolean saveRecording, String className) {
        // Implement logic to stop recording
        if (saveRecording && className != null) {
            System.out.println("Recording saved for failed test: " + className);
        } else {
            System.out.println("Recording discarded.");
        }
    }
	
}
