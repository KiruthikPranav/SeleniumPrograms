package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsSlider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");											//get url
		
		//Slider
		WebElement slider = driver.findElement(By.id("slider"));	//Storing that slider locator on webelements
		Actions act = new Actions(driver);							//Using Actions
		//act.dragAndDropBy(source, xOffset, yOffset); This is how we enter values
		act.dragAndDropBy(slider, 0,100).build().perform(); 		//Here we dragAndDropBy method not dragAndDrop
		
		/*
		  		We can Do like this.
		driver.findElement(By.id("slider")).click();
		int numberOfTimeToSlide = 25;
		Actions act = new Actions(driver);
		for(int i =0;i<numberOfTimeToSlide;i++) {
			act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		}
		*/
	}
}
