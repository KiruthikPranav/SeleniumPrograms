package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://zero.webappsecurity.com/");		//URL of Zero Web App Security site
		driver.manage().window().maximize();				//Used to Maximize the Windows
		driver.navigate().to("https://www.flipkart.com/");	//from zerowebappsecurity to flipkart navigate
		driver.navigate().back();							//from flipkart to ZeroWebAppSecurity
		driver.navigate().forward();						//again from zerowebappsecurity to flipkart navigate
		driver.navigate().refresh();						//refresh the page
	}
}
