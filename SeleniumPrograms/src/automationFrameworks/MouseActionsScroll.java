package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActionsScroll {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
			WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");															//get url
			driver.findElement(By.xpath("//span[contains(text(),'Login')]//preceding::button[1]")).click();		//Closing Login
			Thread.sleep(3000);
			/*
			 * Mouse Scroll Actions using JavaScript
			 */
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,1000)");														//Scroll
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");									//Scroll to End of the page
		
	}

}
