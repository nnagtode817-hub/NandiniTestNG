package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
	
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	// email
	driver.findElement(By.id("email")).sendKeys("prathyusha");
	// password
	driver.findElement(By.id("pass")).sendKeys("ashwika142019");
	// login
	driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
}
}
