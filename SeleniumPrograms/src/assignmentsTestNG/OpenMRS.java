package assignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenMRS {
	WebDriver driver;														//globalizing driver
	
	//Opening Chrome Browser and Hitting URL
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();											
		driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");		
		driver.manage().window().maximize();
	}
	
	//Login page
	@Test
	public void b_login() throws InterruptedException {	
		driver.findElement(By.id("username")).sendKeys("admin");			//Username
		driver.findElement(By.id("password")).sendKeys("Admin123");			//password
		driver.findElement(By.id("Pharmacy")).click();						//Selecting Location
		WebElement logIn = driver.findElement(By.id("loginButton"));
		logIn.click();														//Submit
		Thread.sleep(3000);
	}	
	
	//Registering Patient

	//Personal Details
	@Test
	public void c_personalDetails() throws InterruptedException {
		WebElement register = driver.findElement(By.xpath("//h4[contains(text(),'Logged')]//following::i[3]"));
		register.click();
		driver.findElement(By.name("givenName")).sendKeys("Kiruthik");			//Name
		driver.findElement(By.name("familyName")).sendKeys("Karthigeyan");
		WebElement nextOne = driver.findElement(By.id("next-button"));			//Submit
		nextOne.click();
		Select gender = new Select(driver.findElement(By.name("gender")));		//Gender
		gender.selectByVisibleText("Male");
		WebElement nextTwo = driver.findElement(By.id("next-button"));			//Submit
		nextTwo.click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("17");			//date of birth
		Select month = new Select(driver.findElement(By.id("birthdateMonth-field")));
		month.selectByVisibleText("August");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1997");
		WebElement nextThree = driver.findElement(By.id("next-button"));		//Submit
		Thread.sleep(3000);
		nextThree.click();
	}
		
	//General Information
	@Test
	public void d_generalDetails() throws InterruptedException {
		driver.findElement(By.id("address1")).sendKeys("6th main road sadasiva nagar");	//address
		driver.findElement(By.id("address2")).sendKeys("Madipakkam");
		driver.findElement(By.id("cityVillage")).sendKeys("Chennai");
		driver.findElement(By.id("stateProvince")).sendKeys("TamilNadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postalCode")).sendKeys("600091");
		WebElement next = driver.findElement(By.id("next-button"));				//Submit
		next.click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");		//Mobile Number
		WebElement nextTwo = driver.findElement(By.id("next-button"));			//Submit
		nextTwo.click();
		Select relations = new Select(driver.findElement(By.id("relationship_type")));
		relations.selectByVisibleText("Child");									//Relations
		driver.findElement(By.xpath("//h3[contains(text(),'related')]//following::input[1]")).sendKeys("Kiruthik");
		WebElement nextThree = driver.findElement(By.id("next-button"));		//Submit
		Thread.sleep(3000);
		nextThree.click();
	}
	
	//Confirmation
	@Test
	public void f_confirm() throws InterruptedException {
		WebElement next = driver.findElement(By.id("submit"));					//Submit
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		driver.close();
	}
}
