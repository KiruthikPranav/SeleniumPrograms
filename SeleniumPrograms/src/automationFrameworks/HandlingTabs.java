package automationFrameworks;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");										//get url
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		ArrayList<String> gmailTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(gmailTabs.get(1));
		driver.findElement(By.id("firstName")).sendKeys("Kiruthik");
		
		
	}
}
