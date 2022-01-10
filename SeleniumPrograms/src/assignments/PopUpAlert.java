package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 				Alert PopUp
 */
public class PopUpAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();							//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://demo.automationtesting.in/Alerts.html");		//URL of Automation Testing site
		driver.manage().window().maximize();							//Used to Maximize the Windows
		driver.findElement(By.xpath("//button[contains(text(),'button')]//preceding::a[3]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'button')]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();				
		String alertText = alert.getText();								//get text from alert
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(3000);
		driver.close();
	}
}
