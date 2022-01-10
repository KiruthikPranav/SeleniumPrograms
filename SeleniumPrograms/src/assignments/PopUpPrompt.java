package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 			Prompt PopUp
 */
public class PopUpPrompt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();								//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://demo.automationtesting.in/Alerts.html");			//URL of Automation Testing site
		driver.manage().window().maximize();								//Used to Maximize the Windows
		driver.findElement(By.xpath("//button[contains(text(),'button')]//preceding::a[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
		Alert alert = driver.switchTo().alert();							//alert driver to switch 
		String alertText = alert.getText();									//get text from the Alert
		System.out.println(alertText);
		alert.sendKeys("Kiruthik Pranav");									//Prompting - send keys to field
		alert.accept();														//click okay
		Thread.sleep(3000);	
		String namePrompt = driver.findElement(By.id("demo1")).getText();	//Print Prompted field
		System.out.println(namePrompt);
		Thread.sleep(5000);
		driver.close();
	}
}
