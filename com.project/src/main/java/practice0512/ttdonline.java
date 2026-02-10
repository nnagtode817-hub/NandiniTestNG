package practice0512;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ttdonline {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
	        WebDriverWait wait = new WebDriverWait(driver,10);
	        // wait for login button
	        WebElement login= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'Login.aspx')]")));

}
}