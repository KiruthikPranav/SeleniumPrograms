package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YourLogoForTestNGAlphabetical {
	WebDriver driver;														//Globalize the driver. so that it works on all method
	
	//we have to split the programs
	
	//write @Test and import TestNG
	
	//Priority Based on Alphabetical Order
	//prioriting the methods. so that compiler starts run the script in our own way. else compiler run the script in alphabetical order
	@Test
	public void a_pageLoad() {												//creating methods. method name is our choice
	System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();											//upcasting
	driver.get("http://automationpractice.com/index.php")			;		//site url
	driver.manage().window().maximize();
	}
	
	//Registration
	@Test
	public void b_initialRegistration() throws InterruptedException {			//creating methods. method name is our choice
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.id("email_create")).sendKeys("hkhfsenniy@yopmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("SubmitCreate")).click();
	Thread.sleep(5000);
	}	
	
	//Registration Form Filling
	
	//Personal Information
	@Test
	public void c_personalInfo() throws InterruptedException {
	WebElement radio1 = driver.findElement(By.id("id_gender2"));
	Thread.sleep(5000);
	radio1.click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Kiruthik");
	Thread.sleep(5000);
	driver.findElement(By.id("customer_lastname")).sendKeys("Pranav");
	Thread.sleep(5000);
	driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
	driver.findElement(By.id("days")).click();
	Thread.sleep(5000);
	Select days = new Select (driver.findElement(By.id("days")));
	days.selectByVisibleText("1  ");
	driver.findElement(By.id("days")).click();
	driver.findElement(By.id("months")).click();
	Thread.sleep(5000);
	Select months = new Select (driver.findElement(By.id("months")));
	months.selectByVisibleText("June ");
	driver.findElement(By.id("months")).click();
	driver.findElement(By.id("years")).click();
	Thread.sleep(5000);
	Select years = new Select (driver.findElement(By.id("years")));
	years.selectByVisibleText("1988  ");
	driver.findElement(By.id("years")).click();
	}
	
	//Address Informations
	@Test
	public void d_addressInfo() {
	driver.findElement(By.id("firstname")).sendKeys("Sujan");
	driver.findElement(By.id("lastname")).sendKeys("Kumar");
	driver.findElement(By.id("company")).sendKeys("QSpiders");
	driver.findElement(By.id("address1")).sendKeys("Chromepet");
	driver.findElement(By.id("address2")).sendKeys("Chennai");
	driver.findElement(By.id("city")).sendKeys("Chennai");
	driver.findElement(By.id("id_state")).click();
	Select state = new Select (driver.findElement(By.id("id_state")));
	state.selectByVisibleText("Florida");
	driver.findElement(By.id("id_state")).click();
	driver.findElement(By.id("postcode")).sendKeys("32003");
	driver.findElement(By.id("other")).sendKeys("QA Testing Information");
	driver.findElement(By.id("phone_mobile")).sendKeys("8484848584");
	driver.findElement(By.id("alias")).sendKeys("Address-1");
	driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	}
	
	//Sign out
	@Test
	public void  e_signOut() {
	driver.findElement(By.linkText("Sign out")).click();
	}
	
	//Sign in
	@Test
	public void f_signIn() {
	driver.findElement(By.id("email")).sendKeys("hkhfsenniy@yopmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
	driver.findElement(By.id("SubmitLogin")).click();
	
	}
	
}
