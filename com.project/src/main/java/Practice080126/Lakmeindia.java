package Practice080126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lakmeindia {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.lakmeindia.com/");
        
        WebElement log = driver.findElement(By.xpath("//a[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable account']"));
        log.click();
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("nnagtode817@gmail.com");
        WebElement con = driver.findElement(By.xpath("//button[@name='commit']"));
        con.click();
        driver.navigate().back();
        WebElement nail = driver.findElement(By.xpath("//p[text()='Nails']"));
        nail.click();
        
        WebElement buy = driver.findElement(By.xpath("//p[@class='checkprices btn Button']"));
        buy.click();
        
        WebElement add = driver.findElement(By.id("Product--form_ATC-7537624580231"));
        add.click();
        
        
       
}
}