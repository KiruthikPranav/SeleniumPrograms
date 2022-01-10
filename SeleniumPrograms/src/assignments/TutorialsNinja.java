package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate TutorialsNinja
public class TutorialsNinja {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");	//URL of TutorialsNinja site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.name("firstname")).sendKeys("Kiruthik");
		driver.findElement(By.name("lastname")).sendKeys("Pranav");
		driver.findElement(By.name("email")).sendKeys("kiruthikpranav97@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9876543210");
		driver.findElement(By.name("password")).sendKeys("Kiruthik123");
		driver.findElement(By.name("confirm")).sendKeys("Kiruthik123");
		WebElement subscribe = driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]//following::label[2]"));
		subscribe.click();
		WebElement privacyPolicy = driver.findElement(By.xpath("//b[contains(text(),'Privacy')]//following::input[1]"));
		privacyPolicy.click();
		driver.findElement(By.xpath("//b[contains(text(),'Privacy')]//following::input[2]")).click();
		Thread.sleep(5000);
		driver.close();	
	}
}
