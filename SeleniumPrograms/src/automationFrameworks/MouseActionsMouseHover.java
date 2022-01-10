package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsMouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");															//get url
		driver.findElement(By.xpath("//span[contains(text(),'Login')]//preceding::button[1]")).click();
		WebElement electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));		//First we need to Store in WebElement
		Actions act = new Actions(driver);																	//Actions take driver Work
		act.moveToElement(electronics).build().perform();													//Mouse Control move to electronics
	}
}