package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YourStore {
	WebDriver driver;														//Global Variable
	
	//Opening Browser and hitting the url
	@Test (priority =1)
	public void pageLoad() {												
	System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");	
	driver.manage().window().maximize();
	}
	
	//Registration
	
	//Your Personal Details
	@Test (priority =2)
	public void personalDetails() throws InterruptedException {
		driver.findElement(By.id("input-firstname")).sendKeys("Kiruthik");
		driver.findElement(By.id("input-lastname")).sendKeys("Pranav");
		driver.findElement(By.id("input-email")).sendKeys("ngtestautomation@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		Thread.sleep(3000);
	}

	//Password
	@Test (priority =3)
	public void password() throws InterruptedException {
		driver.findElement(By.id("input-password")).sendKeys("Kuthik12@E");
		driver.findElement(By.id("input-confirm")).sendKeys("Kuthik12@E");
		Thread.sleep(3000);
	}
	
	//Submit
	@Test (priority = 4)
	public void submit() throws InterruptedException {
		WebElement subscribe =driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]//following::input[2]"));
		subscribe.click();
		WebElement policy =driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]//following::input[3]"));
		policy.click();
		WebElement submit =driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]//following::input[4]"));
		submit.click();
		Thread.sleep(3000);
		driver.close();
	}
}
