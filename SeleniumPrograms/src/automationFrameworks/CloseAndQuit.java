package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Naukri web site Automated.Difference Between close() and quit() method
public class CloseAndQuit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://www.naukri.com/");	//URL of Naukri site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		//driver.close();	Close the Main Window [Which means Selenium focus on the Main Site]
		driver.quit();	//  Close Both the Main and Child Window
	}
}
