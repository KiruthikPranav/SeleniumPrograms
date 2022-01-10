package automationFrameworks;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");																//get url
		//We need to store the windows in ArrayList for Index to get the desired windows
		ArrayList<String> naukriWindows = new ArrayList<String>(driver.getWindowHandles());
		//for loop is no need. just to show the windows index rank
		for(String output : naukriWindows) {
			System.out.println(output);
		}
		//getting title of the Main Window
		String mainWindowTitle = driver.getTitle();
		System.out.println(mainWindowTitle);
		//Index 1 means second window. Here We are Switching from 0 to 1 [main window to child window]
		//now the focus is on child window 
		driver.switchTo().window(naukriWindows.get(1));
		String childWindowTitle = driver.getTitle();
		System.out.println(childWindowTitle);
		//now focus is in child window.
		driver.close();//so it close child window only
		
		
		
	}
}
