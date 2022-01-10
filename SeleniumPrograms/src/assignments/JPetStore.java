package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Automate JPetStore

public class JPetStore {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");	//URL of JPetStore site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.xpath("//td[contains(text(),'User')]//following::input[1]")).sendKeys("Kiruthik97");//name field keeps change
		driver.findElement(By.name("password")).sendKeys("Kiruthik12345");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Kiruthik12345");
		driver.findElement(By.name("account.firstName")).sendKeys("Kiruthik");
		driver.findElement(By.name("account.lastName")).sendKeys("Pranav");
		driver.findElement(By.name("account.email")).sendKeys("kiruthikpranav17@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9876543210");
		driver.findElement(By.name("account.address1")).sendKeys("6th main road sadasiva nagar");
		driver.findElement(By.name("account.address2")).sendKeys("Madipakkam");
		driver.findElement(By.name("account.city")).sendKeys("Chennai");
		driver.findElement(By.name("account.state")).sendKeys("TamilNadu");
		driver.findElement(By.name("account.zip")).sendKeys("60022");
		driver.findElement(By.name("account.country")).sendKeys("India");
		driver.findElement(By.name("account.state")).sendKeys("TamilNadu");
		driver.findElement(By.name("account.state")).sendKeys("TamilNadu");
		Select  language  = new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("english");
		Select  category = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("FISH");
		WebElement myList = driver.findElement(By.name("account.listOption")); // By storing element in the WebElement it Works 100% 
		myList.click();
		WebElement myBanner = driver.findElement(By.name("account.bannerOption")); // By storing element in the WebElement it Works 100% 
		myBanner.click();
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
