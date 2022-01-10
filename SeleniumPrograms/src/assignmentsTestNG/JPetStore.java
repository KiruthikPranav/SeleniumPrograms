package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JPetStore {
	WebDriver driver;														//Global Variable
	
	//Opening Browser and hitting the url
	@Test (priority =1)
	public void pageLoad() {												
	System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");	
	driver.manage().window().maximize();
	}
	
	//Registration
	
	//User Information
	@Test (priority =2)
	public void userInformation() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("KPska17");
		driver.findElement(By.name("password")).sendKeys("Pvdsml123@");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Pvdsml123@");
		Thread.sleep(3000);
	}
	
	//Account Information
	@Test (priority = 3)
	public void accountInformation() throws InterruptedException {
		driver.findElement(By.name("account.firstName")).sendKeys("Kiruthik");
		driver.findElement(By.name("account.lastName")).sendKeys("Pranav");
		driver.findElement(By.name("account.email")).sendKeys("ngtastautomations@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9876543321");
		driver.findElement(By.name("account.address1")).sendKeys("45,6th main road");
		driver.findElement(By.name("account.address2")).sendKeys("Velachery");
		driver.findElement(By.name("account.city")).sendKeys("Chennai");
		driver.findElement(By.name("account.state")).sendKeys("Tamil Nadu");
		driver.findElement(By.name("account.zip")).sendKeys("60001");
		driver.findElement(By.name("account.country")).sendKeys("India");
		Thread.sleep(3000);
	}
	
	//Profile Information
	@Test (priority = 4)
	public void profileInformation() throws InterruptedException {
		Select language =new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select category =new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("DOGS");
		WebElement myList = driver.findElement(By.xpath("//td[contains(text(),'MyList')]//following::input[1]"));
		myList.click();
		WebElement myBanner = driver.findElement(By.xpath("//td[contains(text(),'MyList')]//following::input[2]"));
		myBanner.click();
		WebElement submit = driver.findElement(By.xpath("//td[contains(text(),'MyList')]//following::input[3]"));
		submit.click();
		Thread.sleep(3000);
		driver.close();
	}

}
