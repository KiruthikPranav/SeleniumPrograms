package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");												//get url
		driver.findElement(By.xpath("//a[contains(text(),'Sign ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("augustsunday97@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Kiruthikpranav12345+");
		driver.findElement(By.xpath("//input[@id='passwd']//following::i[1]")).click();
		driver.navigate().refresh();
		
	}
}
