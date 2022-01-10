package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");									//get url
		
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();				//for right click we use contextClick
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		Alert alert = driver.switchTo().alert();				
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();											//Accept Okay
		Thread.sleep(5000);
		driver.close();
	}
}
