package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");									//get url
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();			We can use Enter also
		Alert alert = driver.switchTo().alert();				
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();											//Accept Okay
	}
}
