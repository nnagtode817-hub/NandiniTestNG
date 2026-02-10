package Practice151225;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blinkit {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://blinkit.com/?srsltid=AfmBOoph6wL7DO8pLF_pEgHRGI66G4g_GdqWr3Luj2Kuoj9rFpkJ4EBH"); 
	        driver.findElement(By.xpath("//input[@name='select-locality']")).sendKeys("Hydrabad");
	        driver.findElement(By.xpath("//div[@class='LocationSearchList__LocationDetailContainer-sc-93rfr7-1 bBiSUM']")).click();
            driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

}
