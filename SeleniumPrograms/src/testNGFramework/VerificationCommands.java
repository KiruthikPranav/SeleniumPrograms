package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void b_radioButton() throws InterruptedException {
		WebElement roundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundTrip.click();
		Thread.sleep(3000);
		System.out.println(roundTrip.isEnabled());
	}
	
	@Test
	public void c_checkBox() throws InterruptedException {
		WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		student.click();
		Thread.sleep(3000);
		System.out.println(student.isEnabled());
	}
	
	@Test
	public void d_text() throws InterruptedException {
		System.out.println(driver.findElement(By.id("ctl00_HyperLinkLogin")).isDisplayed());
		Thread.sleep(3000);
		driver.close();
	}
	
}