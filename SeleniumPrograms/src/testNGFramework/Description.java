package testNGFramework;

import org.testng.annotations.Test;

public class Description {
	//gives decription on the console
	@Test(description="Browser open")
	public void browser() {
		System.out.println("Browser Opened");
	}
	
	@Test(description="Browser Closed")
	public void close() {
		System.out.println("Browser Closed");
	}
}
