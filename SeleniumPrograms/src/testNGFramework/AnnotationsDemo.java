package testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
  
  @Test
  public void f() {
	  System.out.println("Printing script");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Printing beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Printing afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Printing beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Printing afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Printing beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Printing afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Printing beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Printing afterSuite");
  }

}
