package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailRegistration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	//URL of RediffMail site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[1]")).sendKeys("Kiruthik Pranav");
		/* it will not work because name field keep change on every refresh
		 * driver.findElement(By.name("nameffgheuhr33")).sendKeys("Kiruthik");
		 */
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[2]")).sendKeys("kiruthikpranav97");
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[3]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[4]")).sendKeys("Kiru@123");
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[5]")).sendKeys("Kiru@123");
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[6]")).sendKeys("kiruthikpranav17@gmail.com");
		driver.findElement(By.xpath("//td[contains(text(),'Full')]//following::input[13]")).sendKeys("9876543219");
		Select date = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]//following::select[1]")));
		date.selectByVisibleText("01");
		Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]//following::select[2]")));
		month.selectByVisibleText("JAN");
		Select year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date')]//following::select[3]")));
		year.selectByVisibleText("2021");
		WebElement gender = driver.findElement(By.xpath("//td[contains(text(),'Gender')]//following::input[1]"));
		gender.click();
		Select country = new Select(driver.findElement(By.xpath("//span[contains(text(),'Country')]//following::select[1]")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//span[contains(text(),'Country')]//following::select[2]")));
		city.selectByVisibleText("Delhi");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//td[contains(text(),'Enter the text shown above')]//following::input[7]")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
