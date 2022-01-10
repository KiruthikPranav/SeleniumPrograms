package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingConfirmPopUp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	//URL of Selemiumeasy site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();		//System.out.println(alert.getText());
		System.out.println(alertText);
		alert.dismiss();						//alert.accept();	We can choose either accept or dismiss
		
		
		//driver.close();
	}
}