package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 	counting Similar Elements like number of links, image
 * 	Here, we use findElements not findelement
 * 	size method is used to count
 */
public class SimilarElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");	//URL of SachinTendulkar wikipedia site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		int linksCount = driver.findElements(By.tagName("a")).size();	//here we use findelements not findelement
		System.out.println("Number of Links available in the page = "+linksCount);
		int imageCount = driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images available in the page = "+imageCount);
		driver.close();
	}
}