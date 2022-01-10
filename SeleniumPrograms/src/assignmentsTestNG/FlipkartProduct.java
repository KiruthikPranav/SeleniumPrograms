package assignmentsTestNG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartProduct {
	WebDriver driver;																	//globalizing driver
	
	//Opening Chrome Browser and Hitting URL
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();					
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		
	}
	
	/*			
	 * 	Product Search
	 * 	Clicking Product and Switch to Product tab
	 * 	Get Title, URL, Price
	 */
	@Test
	public void b_searchProduct() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Login')]//preceding::button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]//preceding::input[6]")).sendKeys("iphone");	//Searching Product
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]//preceding::button")).click();				//Clicking search button	
		Thread.sleep(3000);
	}
	
	//Get Title, URL, Price
	@Test
	public void c_getInfo() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Sort')]//following::a[1]")).click();				//Clicking Product
		Thread.sleep(3000);
		ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchTab.get(1));																//Switching to Product Tab
		String title = driver.getTitle();																		//Title
		System.out.println("Title of the page is : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Url of the page is : "+url);														//URL
		String price = driver.findElement(By.xpath("(//div[contains(text(),'₹49,999')])[1]")).getText();
		System.out.println("Price of the Product : "+price);													//Price
		Thread.sleep(3000);
	}
}
