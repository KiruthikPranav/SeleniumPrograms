package testNGFramework;

import org.testng.annotations.Test;

public class TestCaseMultipleRun {
	//invocationCount = NumberOfTimeToOccur
	
	@Test(invocationCount = 3) 		//Here We can change value
	public void demo() {
		System.out.println("Hello");
	}
	
}
