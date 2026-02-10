package pr070226;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	  //WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
      //options.addArguments("--start-maximized");
      options.addArguments("--remote-allow-origins=*");
      options.addArguments("--start-maximized");
	  //System.setProperty("webdriver.driver.chrome", "");
      
	  System.out.println("@Test");
	  driver = new ChromeDriver(options);
		 driver.get("https://www.firstcry.com");
		
  }		
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@@BeforeMethod");
 
  }
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("@@AfterMethod");
 
  }
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@  @BeforeClass\n");
 
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
 
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
 
  }
 
  @AfterTest
  public void afterTest() {
	  System.out.println("@@AfterTest");
 
  }
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@  @BeforeSuite");
 
  }
 
  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
 
  }
 
}