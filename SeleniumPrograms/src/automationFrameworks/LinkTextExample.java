package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://zero.webappsecurity.com/login.html");			
		driver.manage().window().maximize();				//Used to Maximize the Windows
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();	We can use like this
		//driver.findElement(By.linkText("Forgot your password ?")).click();		Link text
		driver.findElement(By.partialLinkText("Forgot")).click();				//Partial Link Text
		
	}
}
