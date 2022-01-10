package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");	//Driver Preference, Driver Location
		WebDriver driver = new ChromeDriver();																//ChromeDriver upcasting for WebDriver Interface
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");															//get url
		driver.findElement(By.id("user-name")).sendKeys("standard_user");									//Enter Login
		driver.findElement(By.id("password")).sendKeys("secret_sauce");										//Enter password
		driver.findElement(By.id("login-button")).click();													//clicking Login Button
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();								//Adding product to cart
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();							//Adding product to cart
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();							//Adding product to cart
		Thread.sleep(3000);
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();								//Removing product from cart
		Thread.sleep(3000);
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		
		//filling details after checkout
		driver.findElement(By.id("first-name")).sendKeys("Kiruthik");										
		driver.findElement(By.id("last-name")).sendKeys("Pranav");
		driver.findElement(By.id("postal-code")).sendKeys("689123");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		//Printing text on console
		String title = driver.getTitle();
		System.out.println("Title of the Page is : "+ title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL for this page is : "+ url);
		String text = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
		System.out.println("Text : "+text);
		String imageStartTag = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]//following::img[1]")).getTagName();
		System.out.println("Get Start Tag name for image : "+imageStartTag);
		String imageCssValue = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]//following::img[1]")).getCssValue("max-width");
		System.out.println("Get Css Vallue for image : "+imageCssValue);
		String attributeValue = driver.findElement(By.id("back-to-products")).getAttribute("name");
		System.out.println("Get Attribute Value for Back Button :"+ attributeValue);
		
		driver.close();
		
	}
}
