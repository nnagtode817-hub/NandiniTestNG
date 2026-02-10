package Practice090226;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




	public class MyBase {
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			String browser = "chrome";
	
		driver = new ChromeDriver();
				
		 switch (browser) {
		case "chrome" : 
		
			driver = new ChromeDriver();
			break;
		
		case "firefox" : 
			
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("No such browser: " + browser);
		}
		 driver.get("https://www.qa-practice.com/");
		 
		}
		@AfterMethod
		public void close() {
		driver.quit();
	}
	
	}
	