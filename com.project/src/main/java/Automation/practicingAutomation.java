package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicingAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#email")).sendKeys("nnagtode817@gmail.com");
	    driver.findElement(By.cssSelector("#pass")).sendKeys("Nandini@123");
	    driver.navigate().to("https://demoqa.com/text-box");
	    driver.findElement(By.cssSelector("#userName")).sendKeys("kanha Giri");
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kanha123@gmail.com");
	    driver.findElement(By.cssSelector("#currentAddress")).sendKeys("yavatmal,MH");
	    driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Same As Above");
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	}

}
