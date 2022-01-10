package advancedSeleniumOwn;

import org.testng.annotations.DataProvider;

public class DataProviderDifferentClass {
	
	@DataProvider(name="differentClass")
	public Object[][] demo(){
		return new Object[][]
				{
			{"Java","SunMicrosystem","Oracle"},
			{"Sql","Oracle","Microsoft"},
			{"Selenium","IDE","Webdriver"}
				};
	}
	
}