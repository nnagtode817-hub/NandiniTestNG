package Practice120126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewSwiggy {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiggy.com/restaurants");
        WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
        search.click();
        Thread.sleep(3000);
        
        WebElement menu = driver.findElement(By.xpath("//input[@type='text']"));
        menu.sendKeys("Dal Makhani");
        
        WebElement paratha = driver.findElement(By.xpath("//img[@alt='restaurants curated for paratha']"));
        paratha.click();
        
        
        

	}

}
