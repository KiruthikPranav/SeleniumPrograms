package testNGFramework;

import org.testng.annotations.Test;

public class MethodDependancyMultiple {
	
	@Test (dependsOnMethods = "b_B")
	public void a_A() {
		System.out.println("From A Method");
	}
	
	@Test (dependsOnMethods="f_F")
	public void b_B() {
		System.out.println("From B Method");
	}
	
	@Test (dependsOnMethods = "a_A")
	public void c_C() {
		System.out.println("From C Method");
	}
	
	@Test (enabled = false)
	public void d_D() {
		System.out.println("From D Method");
	}
	
	@Test  (dependsOnMethods = "c_C")
	public void e_E() {
		System.out.println("From E Method");
	}
	
	@Test
	public void f_F() {
		System.out.println("From F Method");
	}
	
}
