package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelectorExample {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
	}

	@Test
	public void b_signIn() {
		/*css selector can be done only by id and class
		while using id StartTag#value
		while using className StartTag.value
		*/
		//driver.findElement(By.className("signin btn btn-info")).click();
		driver.findElement(By.cssSelector("button.signin btn btn-info")).click();			//class
		//driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");		//id
		driver.findElement(By.name("user_password")).sendKeys("Password");
		driver.findElement(By.name("submit")).click();
	}
	
}
