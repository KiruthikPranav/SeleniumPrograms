package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		/*		SwagLab
		 * login into the SwagLab web site
		 * Add product to the cart
		 * Click Cart
		 * Remove the Added Product from the cart
		 */
public class SwaglabAddToCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");									//SwagLab 	URL
		driver.manage().window().maximize();										//Maximize Chrome Browser
		driver.findElement(By.id("user-name")).sendKeys("standard_user");			//Type User Name
		driver.findElement(By.id("password")).sendKeys("secret_sauce");				//Type Password
		driver.findElement(By.id("login-button")).click();							//Click Login
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();		//Add product to Cart
		Thread.sleep(2000);
		driver.findElement(By.id("shopping_cart_container")).click();				//Click Cart to Remove Product
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();			//Removing the Product
		Thread.sleep(3000);
		driver.close();
									
	}
}
