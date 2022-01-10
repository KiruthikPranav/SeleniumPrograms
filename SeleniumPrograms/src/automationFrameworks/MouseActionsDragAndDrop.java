package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");											//get url
		
		WebElement drag = driver.findElement(By.id("draggable"));											//drag
		WebElement drop = driver.findElement(By.id("droppable"));											//drop
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();														//dragAndDrop Method		
	}
}
