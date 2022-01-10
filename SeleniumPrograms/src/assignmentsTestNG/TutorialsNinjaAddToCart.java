package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialsNinjaAddToCart {
	WebDriver driver;																			//globalizing driver
	
	//Opening Chrome Browser and Hitting URL
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();											
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/search&search=laptop");		
		driver.manage().window().maximize();
	}
	
	//Registration
	@Test
	public void b_productAddRemove() throws InterruptedException {	
		WebElement category=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(category).build().perform();												//Product Select
		driver.findElement(By.xpath("(//a[contains(text(),'Mac')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[2]")).click();				//Add to cart
		Thread.sleep(3000);
		driver.findElement(By.id("cart-total")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'iMac')]//following::button[1]")).click();//Removing Product
		Thread.sleep(3000);
		driver.close();
	}	
}
