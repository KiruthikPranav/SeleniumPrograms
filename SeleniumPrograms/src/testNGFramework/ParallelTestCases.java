package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTestCases {
	WebDriver driver;
	
	@BeforeTest
	public void browser() {
	System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Test
	public void demo() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	}
	
	@Test
	public void alpha() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/testng-execute-multiple-test-suites.html");
	}
	
	@AfterTest
	public void closure() {
		driver.quit();
	}
	
}
