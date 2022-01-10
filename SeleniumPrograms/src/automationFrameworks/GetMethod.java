package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//ChromeDriver upcasting for WebDriver Interface
		driver.get("http://zero.webappsecurity.com/");	//URL of ZeroAppSecurity site
		driver.manage().window().maximize();	//Used to Maximize the Windows
		//System.out.println(driver.getTitle());	we can by this method also. But we should not use like this.
		String pageTitle = driver.getTitle();	//	So we put the value in variable to TITLE OF THE PAGE
		System.out.println("The Page Title is "+pageTitle);	// Then we print
		String pageUrl = driver.getCurrentUrl();	// TO GET THE URL OF THE PAGE
		System.out.println(pageUrl);
		String tagName= driver.findElement(By.id("searchTerm")).getTagName();	// To get The TageName
		System.out.println(tagName);
		String tagNameByXpath=driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getTagName();	//TagName By xpath
		System.out.println(tagNameByXpath);
		String getAttributeValue =driver.findElement(By.id("searchTerm")).getAttribute("placeholder"); //getAttribute Value
		System.out.println("get placeholder locator value = "+getAttributeValue);
		String getAttributeValueName = driver.findElement(By.id("searchTerm")).getAttribute("name");
		System.out.println("get name locator value = "+getAttributeValueName);
		String fontSize = driver.findElement(By.id("searchTerm")).getCssValue("font-size");
		System.out.println("The CSS value for font-size = "+fontSize);
		String text =driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println("Gets the text value of the page = "+text);
		String textParagraph=driver.findElement(By.xpath("(//p[starts-with(text(),'Use Zero')])[1]")).getText();
		System.out.println("Locate Text Paragraph = "+textParagraph);
		driver.close();
	}
}