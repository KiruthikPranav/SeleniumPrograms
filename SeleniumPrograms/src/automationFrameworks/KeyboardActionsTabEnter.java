package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Keyboard Actions Tab Enter
 */
public class KeyboardActionsTabEnter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://www.facebook.com/");			//URL of Facebook site
		driver.manage().window().maximize();				//Used to Maximize the Windows
		driver.findElement(By.id("email")).sendKeys("ioriorn@gmail.com");
		//Actions
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"OJFOIOI21@").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		

	}
}
