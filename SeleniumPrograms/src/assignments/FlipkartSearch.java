package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");															//get url
		driver.findElement(By.xpath("//span[contains(text(),'Login')]//preceding::button[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]//preceding::input[6]")).sendKeys("iphone");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]//preceding::button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Sort')]//following::a[1]")).click();
		
	}
}
