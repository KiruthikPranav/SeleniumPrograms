package advancedSeleniumOwn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	
	@Test(dataProvider="details")
	public void demo(String name, String branch, int rank) {
		System.out.println("Name : "+name+" Branch is : "+branch+" and Rank is : "+rank);
	}
	
	@DataProvider
	public Object[][] details(){
		return new Object[][]
				{
			{"Kiruthik","ECE",1},
			{"Pranav","MECH",2},
			{"Karthi","EEE",3}
				};
	}
}
