package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
	}
	
	@Test
	public void b_assertEquals() {
		String text = driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"ONLINE BANKING");
		System.out.println("AssertEquals Pass");
	}

	@Test
	public void c_assertNotEquals() {
		String textNotEquals = driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getText();
		Assert.assertNotEquals(textNotEquals,"Online Banking");
		System.out.println("AssertNotEquals Pass");
	}
	
	@Test
	public void d_assertTrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getText()));
		System.out.println("AssertTrue Pass");
	}
	
	@Test
	public void e_assertFalse() {
		String textNotEquals = driver.findElement(By.xpath("//strong[contains(text(),'Online')]")).getText();
		Assert.assertFalse("Online Banking".equals(textNotEquals));
		System.out.println("AssertionsFalse Pass");
	}
	
	@Test
	public void f_assertNotNull() {
		Object obj = driver.getTitle();
		Assert.assertNotNull(obj);
		System.out.println("AssertNotNull Pass");
	}
	
	@Test
	public void g_assertNull() {
		Object obj = driver.getTitle();
		Assert.assertNull(obj);
		System.out.println("AssertNull Pass");
	}

}