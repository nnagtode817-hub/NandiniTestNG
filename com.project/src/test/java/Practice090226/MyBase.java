package Practice090226;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


	public class MyBase {
		WebDriver driver;
		String browser = System.getProperty("browser");
	 
		@ BeforeTest
		//@Parameters (  "browser" )
		public void p1()
		{
			System.out.println(browser);
			driver = new ChromeDriver();
			driver.get("https://www.qa-practice.com/");
			driver.manage().window().maximize();
		}
	}
	 
	 