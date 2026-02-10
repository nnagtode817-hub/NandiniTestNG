package Practice161225;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookSignUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nandini");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Giri");
        
        //Day dropdown
        Select day = new Select(driver.findElement(By.id("day")));	
        day.selectByVisibleText("25");
        
        //month dropdown
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Jun");
        
        //year dropdown
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1991");
        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("7972299279");
        driver.findElement(By.xpath("//input[@name= 'reg_passwd__']")).sendKeys("Athang@1234");
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
       
 
	
	
	
	
	
	}
}