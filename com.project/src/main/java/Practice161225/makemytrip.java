package Practice161225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7972299279");
	
	
	
	
	}}