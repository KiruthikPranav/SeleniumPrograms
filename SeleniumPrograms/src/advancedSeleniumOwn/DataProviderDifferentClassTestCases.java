package advancedSeleniumOwn;

import org.testng.annotations.Test;

public class DataProviderDifferentClassTestCases {
	
	@Test(dataProvider="differentClass",dataProviderClass=DataProviderDifferentClass.class)
	public void testDifferent(String program,String company1, String company2) {
		System.out.println(program+" "+company1+" "+company2);
	}
	
}
