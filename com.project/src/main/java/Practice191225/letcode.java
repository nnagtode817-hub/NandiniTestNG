package Practice191225;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letcode {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/test");
			
			/****1.Input
			
			driver.findElement(By.xpath(" //a[text()=' Edit '] ")).click();
			driver.findElement(By.cssSelector("#fullName")).sendKeys("Nandini Giri");
			WebElement appendBox = driver.findElement(By.xpath("//input[@value='I am good']"));
			
			//append text + press TAB
			appendBox.sendKeys("I am good", Keys.TAB);
			
			WebElement value= driver.findElement(By.cssSelector("#getMe"));
			// to get a text
			String text = value.getAttribute("value");
			System.out.println("Text inside the box is:"  + text);
			
			driver.findElement(By.cssSelector("#clearMe")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Enter']")).isDisplayed();
			WebElement readonly= driver.findElement(By.xpath("//input[@value='This text is readonly']"));
			String readonlyBox= readonly.getAttribute("readonly");
			
			if(readonlyBox != null){
				System.out.println("Text box is read only");
			} else {
				System.out.println("Text box is not read only");
			}
	
	        //2.Button
			driver.findElement(By.xpath("https://letcode.in/button"));
			driver.findElement(By.xpath("//a[text()=' Click ']")).click();
			driver.findElement(By.cssSelector("#home")).click();
			WebElement findlocation= driver.findElement(By.xpath("//button[@class='button is-link is-outlined']"));
			findlocation.getLocation();
			
			***/
			
			//select
			/**
			driver.findElement(By.xpath("//a[text()=' Drop-Down ']")).click();
			
			Select fruit = new Select(driver.findElement(By.cssSelector("#fruits")));
			fruit.selectByValue("2");
		    
			Select heros= new Select(driver.findElement(By.cssSelector("#superheros")));
		    heros.selectByValue("im");
		    
		    Select language= new Select(driver.findElement(By.cssSelector("#lang")));
			language.selectByVisibleText("Python");
			
			Select country = new Select(driver.findElement(By.cssSelector("#country")));
			country.selectByVisibleText("Brazil");
		**/	

	
	     driver.findElement(By.xpath("//a[text()=' Toggle ']")).click();
	
	     driver.findElement(By.xpath("//label[text()='Select any one']"));
	     driver.findElement(By.cssSelector("#yes")).click();
	
	     driver.findElement(By.xpath("//label[text()='Cofirm you can select only one radio button']"));
	     driver.findElement(By.cssSelector("#two")).click();
	     
	     driver.findElement(By.xpath("//label[text()='Find which one is selected']"));
	     driver.findElement(By.cssSelector("#notfoo")).isSelected();
	     
	   driver.findElement(By.xpath("//label[text()='Confirm last field is disabled']"));
	   	driver.findElement(By.cssSelector("#maybe")).isDisplayed();
	   	
	   	driver.findElement(By.xpath("//label[text()='Accept the T&C']"));
	   	
	
	}
	}