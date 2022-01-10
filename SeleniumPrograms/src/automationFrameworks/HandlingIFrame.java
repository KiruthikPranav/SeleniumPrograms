package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://nunzioweb.com/index.shtml");													//get url
		driver.switchTo().frame("oddcouple");																//for i frame we switch to frame method
		String text = driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();	//then we can find elements
		System.out.println(text);	
	}
}
