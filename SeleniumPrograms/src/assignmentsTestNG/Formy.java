package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Formy {
	WebDriver driver;														//globalizing driver
	
	//Opening Chrome Browser and Hitting URL
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();											
		driver.get("https://formy-project.herokuapp.com/form");		
		driver.manage().window().maximize();
	}
	
	//Registration
	@Test
	public void b_formFilling() throws InterruptedException {	
		driver.findElement(By.id("first-name")).sendKeys("Kiruthik");			//First Name
		driver.findElement(By.id("last-name")).sendKeys("Pranav");				//Last Name
		driver.findElement(By.id("job-title")).sendKeys("Testing");				//Job
		WebElement education = driver.findElement(By.id("radio-button-2"));
		education.click();														//Education
		WebElement gender = driver.findElement(By.id("checkbox-1"));
		gender.click();															//Gender
		Select experience = new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("2-4");									//Years of Experience
		driver.findElement(By.id("datepicker")).sendKeys("17/08/1997");			//Date of Birth
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.close();
	}	

}
