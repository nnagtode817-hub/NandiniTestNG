package Practice090126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toddler {


		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.atoddlerthing.com/");
	        WebElement search = driver.findElement(By.xpath("//a[@class='header__icon-wrapper tap-area hidden-pocket hidden-lap ']"));
	        search.click();
	        
	        WebElement s = driver.findElement(By.xpath("//input[@class='predictive-search__input']"));
	        s.sendKeys("full pant");
	        WebElement select = driver.findElement(By.xpath("//img[@alt='Cuddle Monster - Quilted Full sleeve top and pants for kids'][1]"));
	        select.click();
	        

	
		
		
		
		
		
		
		
		
		}

	}


