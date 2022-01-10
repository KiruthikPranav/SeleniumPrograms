package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialsNinjaSearch {
	WebDriver driver;																												//globalizing driver
	
	//Opening Chrome Browser and Hitting URL
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();											
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=20_27");		
		driver.manage().window().maximize();
	}
	
	//Search Laptop
	@Test
	public void b_laptop() throws InterruptedException {
		driver.findElement(By.name("search")).sendKeys("Laptop");
		Thread.sleep(3000);
		Actions act = new Actions(driver); 
		act.sendKeys(Keys.ENTER).build().perform();
		
		//Printing Title, URL, Attributes, CSS value, Search-Laptop
		String title = driver.getTitle();																								//Title
		System.out.println("Title of the Page is : "+title);
		String currentUrl = driver.getCurrentUrl();																						//URL
		System.out.println("URL of the Page is : "+currentUrl);
		String startTag = driver.findElement(By.xpath("//h1[contains(text(),'Search')]")).getTagName();									//Start Tag
		System.out.println("TagName is : "+startTag);
		String attribute = driver.findElement(By.xpath("//h1[contains(text(),'Search')]//following::input[1]")).getAttribute("id");		//Attribute
		System.out.println("Attribute is : "+attribute);
		String cssValue = driver.findElement(By.xpath("//h1[contains(text(),'Search')]")).getCssValue("font-size");						//CSS Value
		System.out.println("CSS Value is : "+cssValue);
		Thread.sleep(5000);
		driver.close();
	}
}
