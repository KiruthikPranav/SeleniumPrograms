package advancedSeleniumOwn;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIfElse {
	
	@Test(dataProvider="Details")
	public void demo(String name,int age) {
		System.out.println(name+" "+age);
	}
	
	@Test(dataProvider="Details")
	public void test(String name) {
		System.out.println(name);
	}
	
	@DataProvider(name="Details")
	public Object[][] data(Method m){
		if(m.getName().equalsIgnoreCase("demo")) {
		return new Object[][] 
		{
			{"Kiruthik",23},
			{"Pranav",24}
		};
		}
		else
		{
			return new Object[][] {
				{"Kiruthik"},
				{"Pranav"}
			};
		}
	}
}