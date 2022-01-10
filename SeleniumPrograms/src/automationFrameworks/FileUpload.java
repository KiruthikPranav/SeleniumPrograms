package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload//");															//get url
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\Kiruthik Pranav\\Pictures\\images.jpg");
		//driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Kiruthik Pranav\\Pictures\\images.jpg"); We can use like this also
		WebElement  click = driver.findElement(By.id("terms"));
		click.click();
		driver.findElement(By.id("submitbutton")).click();
		String text = driver.findElement(By.xpath("//button[@id='submitbutton']//following::center")).getText();
		System.out.println("Text for the page is : "+ text );
		driver.close();
	}
}
