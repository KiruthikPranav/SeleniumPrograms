package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Automate ParaBank Web Site
 * Opening Website
 * Registering Forms
 * submit
 */
public class ParaBank {
	public static void main(String[] args) {
		//System property for Chrome Driver
			System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
			driver.get("https://parabank.parasoft.com/parabank/register.htm");	//URL of ParaBank site
			driver.manage().window().maximize();	//Used to Maximize the Windows
			driver.findElement(By.id("customer.firstName")).sendKeys("Kiruthik");
			driver.findElement(By.id("customer.lastName")).sendKeys("Pranav");
			driver.findElement(By.id("customer.address.street")).sendKeys("99,6th main road sadasiva nagar");
			driver.findElement(By.xpath("//b[contains(text(),'City')]//following::input[1]")).sendKeys("Chennai");
			driver.findElement(By.id("customer.address.state")).sendKeys("TamilNadu");
			driver.findElement(By.id("customer.address.zipCode")).sendKeys("600091");
			driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
			driver.findElement(By.id("customer.ssn")).sendKeys("04427469700");
			driver.findElement(By.id("customer.username")).sendKeys("SKKP3");
			driver.findElement(By.id("customer.password")).sendKeys("Password");
			driver.findElement(By.id("repeatedPassword")).sendKeys("Password");
			driver.findElement(By.xpath("//b[contains(text(),'Confirm')]//following::input[2]")).click();
	}

}
