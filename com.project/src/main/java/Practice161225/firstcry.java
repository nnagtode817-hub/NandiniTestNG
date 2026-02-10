package Practice161225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstcry {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.firstcry.com/?ref=SEM_!GSN_Brand_FirstCry_India");
        driver.findElement(By.xpath("//span[text()=' Register']")).click();
        driver.findElement(By.xpath("//a[text()='Register Here']")).click();
        driver.findElement(By.cssSelector("#usrname")).sendKeys("Nandini G");
        driver.findElement(By.xpath("//input[@name='usremail']")).sendKeys("shubham671990@gmail.com");
        driver.findElement(By.cssSelector("#usrmb")).sendKeys("9561100636");
    	driver.findElement(By.xpath("//div[@id='continueid']")).click();
	
	
	}}