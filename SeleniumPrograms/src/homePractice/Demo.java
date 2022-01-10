package homePractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("Finished");
	}

	@Override
	public void onStart(ITestContext Result) {
		System.out.println("Start");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("Test Within Success Percentage");
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println("Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Test Success");
	}
	
}
