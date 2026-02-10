package Practice130126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class travel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://formy-project.herokuapp.com/");
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement add = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        add.sendKeys("ytl,MH");
        WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
        city.sendKeys("Yavatmal");
        WebElement state = driver.findElement(By.cssSelector("#administrative_area_level_1"));
        state.sendKeys("MAHARASHTRA");
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip code']"));
        zip.sendKeys("445001");
        WebElement con = driver.findElement(By.xpath("//input[@id=\"country\"]"));
        con.sendKeys("India");
        driver.navigate().to("https://formy-project.herokuapp.com/buttons");
        WebElement primary = driver.findElement(By.xpath("//button[text()='Primary']"));
        primary.click();
        WebElement suc = driver.findElement(By.xpath("//button[text()='Success']"));
        suc.click();
        WebElement info = driver.findElement(By.xpath("//button[text()='Info']"));
        info.click();
        WebElement war = driver.findElement(By.xpath("//button[text()='Warning']"));
        war.click();
        WebElement Danger = driver.findElement(By.xpath("//button[text()='Danger']"));
        Danger.click();
        WebElement link = driver.findElement(By.xpath("//button[text()='Link']"));
        link.click();
        
        
        
        
        
        
      
        
        
        
        
        
   
        
        
        
        

	}

}
