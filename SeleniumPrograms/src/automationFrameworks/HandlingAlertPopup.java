package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//handling Alert pop up in selenium easy web site 
public class HandlingAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	//URL of Selemiumeasy site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();		//System.out.println(alert.getText()); We can use directly also
		System.out.println(alertText);			//Print alertText
		alert.accept();							//accept clicks okay
		driver.close();
		
	}
}
