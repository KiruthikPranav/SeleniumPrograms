package testNGFramework;

import org.testng.annotations.Test;

public class MethodDependancy {

	@Test
	public void f1() {
		System.out.println("Printing f1");
	}
	
	@Test(dependsOnMethods= "f3")
	public void f2() {
		System.out.println("Printing f2");
	}
	
	@Test
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
