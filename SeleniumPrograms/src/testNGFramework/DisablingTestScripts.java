package testNGFramework;

import org.testng.annotations.Test;

public class DisablingTestScripts {
	//We can Disable any scipts by using (enabled = false)
	
	@Test
	public void f1() {
		System.out.println("Printing f1");
	}
	
	@Test(enabled = true)						//If we give true it will work. It is not necessary, just to show.
	public void f2() {
		System.out.println("Printing f2");
	}
	
	@Test(enabled = false)						//so that f3 will not executed
	public void f3() {
		System.out.println("Printing f3");
	}
	
	@Test
	public void f4() {
		System.out.println("Printing f4");
	}
	
	@Test
	public void f5() {
		System.out.println("Printing f5");
	}

}