package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * 	opening YourLogo
 * 	clicking sign in
 * 	create new accout
 *  filling all the form 
 *  submit
 */

public class YourLogo {
	public static void main(String[] args) throws InterruptedException {
		// YourLab Web site Automate
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("augustsunday97@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000); // TO WAIT THE PROGRAM TO SLEEP
		/* 					RADIO BUTTON 
		 * THIS BELOW BUTTON CODE WILL WORK OUT OF 10 WORK 7 TIMES ONLY WORK
				driver.findElement(By.id("id_gender2")).click();
				
		* BECAUSE WHEN RUN THE PROGRAM THERE IS WIDER SPACE BETWEEN RAIO BUTTON SO THE SELENIUM GETS CONFUSED
		*/
		// WE GO FOR THIS RADIO BUTTON,BUTTON, CHECK BOX
		WebElement gender = driver.findElement(By.id("id_gender2")); // By storing element in the WebElement it Works 100% 
		gender.click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Kiruthik");
		driver.findElement(By.id("customer_lastname")).sendKeys("Pranav");
		driver.findElement(By.id("passwd")).sendKeys("Kiruthikpranav12345+");
		/*			DROPDOWN
		 * TO SELECT DROPDOWN WE USE Select Class 
		 * FOR EACH DROPDOWN WE USE SEPARATE REFERENCE VARIABLE
		 */
		Select  date = new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("17  "); 
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("August ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1997  ");
		// WebElement 
		WebElement newsLetter = driver.findElement(By.id("newsletter"));
		newsLetter.click();
		
		driver.findElement(By.id("firstname")).sendKeys("Kiruthik");
		driver.findElement(By.id("lastname")).sendKeys("Pranav");
		driver.findElement(By.id("address1")).sendKeys("6th main road,Sadasiva Nagar, Madipakkam");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		// DROPDOWN
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Florida");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone_mobile")).sendKeys("9234567890");
		driver.findElement(By.id("submitAccount")).click();
	}

}
