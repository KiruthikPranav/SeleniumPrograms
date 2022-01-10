package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 		login into swaglab by useraname and password
 * 		clicking menu
 * 		logged out
 */

public class SwagLabs {
	public static void main(String[] args) throws InterruptedException {
		//System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/"); //Get method use to hit the url
		driver.manage().window().maximize(); // Used to Maximize the Windows By manage().window().maximize()
	
							//here we can use id,name,class,Xpath we use different ways 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//here we can use name, class also
		driver.findElement(By.name("password")).sendKeys("secret_sauce");//here we can use id, class also
		driver.findElement(By.xpath("//input[@id='login-button']")).click();//here we can use id,class,name also 
		Thread.sleep(3000);
		//logged into home page
		driver.findElement(By.id("react-burger-menu-btn")).click(); //clicking menu
		Thread.sleep(5000);
		driver.findElement(By.id("logout_sidebar_link")).click(); //clicking logged out
		Thread.sleep(5000);
		driver.close();
		
	}

}
