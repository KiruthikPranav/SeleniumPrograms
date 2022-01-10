package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsIncrementDecrement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://the-internet.herokuapp.com/inputs");			
		driver.manage().window().maximize();				//Used to Maximize the Windows
		driver.findElement(By.xpath("//p[contains(text(),'Number')]//following::input[1]")).sendKeys("1");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		/*
		for(int i =0;i<=10;i++) {
			act.sendKeys(Keys.ARROW_UP).build().perform();
		}
		*/
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		

	}
}
