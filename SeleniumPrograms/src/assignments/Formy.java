package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Automate Formy Web Site
 * Filling Form 
 * Submit
 */
public class Formy {
	public static void main(String[] args) {
		//System property for Chrome Driver
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://formy-project.herokuapp.com/form");	//URL of Formy site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.id("first-name")).sendKeys("Kiruthik");
		driver.findElement(By.id("last-name")).sendKeys("Pranav");
		driver.findElement(By.id("job-title")).sendKeys("Selenium");
		WebElement education =driver.findElement(By.id("radio-button-3"));	//WebElement Interface is used to locate Radio Button,checkbox
		education.click();
		WebElement sex = driver.findElement(By.id("checkbox-1"));
		sex.click();
		Select experience = new Select(driver.findElement(By.id("select-menu")));	//Select used to locate Dropdowns
		experience.selectByVisibleText("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("08/17/1997");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	}
}
