package advancedSeleniumOwn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
	
	@Test(dataProvider="NAME")	//here mandatory to give the name value to dataprovider
	public void demo(String firstName, String LastName) {
		System.out.println(firstName+" "+LastName);
	}
	
	@DataProvider(name = "NAME") //We Can give name ="Value"
	public Object[][] test(){
		return new Object[][] {
			{"Kiruthik","Pranav"},
			{"KIRUTHIK","PRANAV"}
		};
	}
}
