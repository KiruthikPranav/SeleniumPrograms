package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	//URL of Selemiumeasy site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		driver.findElement(By.xpath("(//button[contains(text(),'Prompt')])")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Kiruthik Pranav");		//Send keys
		Thread.sleep(3000);
		alert.accept();
		String confirmationText = driver.findElement(By.id("prompt-demo")).getText();	//Prints Confirmation Text
		System.out.println(confirmationText);
	}
}
