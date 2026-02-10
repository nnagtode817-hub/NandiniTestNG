package Practice231225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class herokuapp {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/?ref=hackernoon.com");
    driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
    

}
}