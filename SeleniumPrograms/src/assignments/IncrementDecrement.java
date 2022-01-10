package assignments;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Increment Decrement Assignment
public class IncrementDecrement {
	public static void main(String[] args) throws InterruptedException {
								//getting number to perform increment decrement
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Integer only : ");
		String num = s.next();
		System.out.print("Enter Integer to Number of time to Increment : ");
		int n = s.nextInt();
		System.out.print("Enter Integer to Number of time to Decrement : ");
		int m = s.nextInt();
		System.out.println("Please Wait... it takes to ChromeDriver and Selenium Automates");
		Thread.sleep(2000);
		
								// Selenium script
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://the-internet.herokuapp.com/inputs");												//get url
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[contains(text(),'Number')]//following::input[1]")).sendKeys(num);	//Send Values 
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//Incrementing
		for(int i =0;i<n;i++) {
			act.sendKeys(Keys.ARROW_UP).build().perform();													//Performs Increment
		}
		Thread.sleep(3000);
		//Decrementing
		for(int i =m;i>0;i--) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();												//Performs Decrement
		}
		Thread.sleep(3000);
		driver.close();
		s.close();
	}
}
