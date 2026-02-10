package Practice090126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toddlerThing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.atoddlerthing.com/");
        WebElement log = driver.findElement(By.xpath("//a[@aria-label='Login']"));
        log.click();
        
        WebElement acc = driver.findElement(By.xpath("//a[text()='Create an account']"));
        acc.click();
        
        WebElement fname = driver.findElement(By.xpath("//input[@id='customer[first_name]']"));
        fname.sendKeys("Nandini");
        
        WebElement lname = driver.findElement(By.xpath("//input[@name='customer[last_name]']"));
        lname.sendKeys("Giri");
        
        WebElement email = driver.findElement(By.xpath("//input[@id='customer[email]']"));
        email.sendKeys("nnagtode817@gmail.com");
        
        WebElement pass = driver.findElement(By.xpath("//input[@name='customer[password]']"));
        pass.sendKeys("Athang@1234");
        
        WebElement create = driver.findElement(By.xpath("//span[@class='loader-button__text']"));
        create.click();
        
        
        

	}

}
