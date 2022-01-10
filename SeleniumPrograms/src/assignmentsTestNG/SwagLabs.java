package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabs {
	WebDriver driver;														//Global Variable
	
	//Opening Browser and hitting the url
	@Test (priority =1)
	public void pageLoad() {												
	System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");	
	driver.manage().window().maximize();
	}
	
	//Sign in
	@Test (priority =2)
	public void signIn() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	
	//Sign out
	@Test (priority =3)
	public void signOut() throws InterruptedException {
		WebElement menu= driver.findElement(By.xpath("//button[contains(text(),'Open')]"));
		menu.click();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
