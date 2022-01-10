package homePractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumPractice {
	String name="kiruthik";
	boolean radio=true;
	
	@Test
	public void a() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Java_(programming_language)");
		driver.close();
	}

}