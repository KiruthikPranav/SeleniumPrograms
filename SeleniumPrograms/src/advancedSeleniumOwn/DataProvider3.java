package advancedSeleniumOwn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {
	
	@Test(dataProvider="test")
	public void demo(String name,String dept,String subject) {	
		System.out.println(name+" "+dept+" "+subject);
	}
	
	@DataProvider
	public Object[][] test(){
		Object[][] data = new Object[2][3]; // Here we can Declare Size of our Array
		
		//1st row
		data[0][0]="Kiruthik";
		data[0][1]="ECE";
		data[0][2]="Java";
		
		//2nd row
		data[1][0]="Pranav";
		data[1][1]="ECE";
		data[1][2]="Selenium";
		
		return data;
	}
}
