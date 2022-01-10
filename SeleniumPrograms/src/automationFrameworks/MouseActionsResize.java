package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsResize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");														//get url
		
		//Resizing Image by X and Y size	
		driver.switchTo().frame(0);					//frame should use
		WebElement resize = driver.findElement(By.xpath("//h3[contains(text(),'Resizable')]/following::div[3]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(resize, 100, 50).perform();		//build not to use
		

	}
}
