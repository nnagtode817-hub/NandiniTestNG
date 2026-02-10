package Practice221225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ultimateQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation/?ref=hackernoon.com");
		
		driver.findElement(By.xpath("//a[text()='Fake Landing Page']")).click();
        driver.findElement(By.xpath("//a[text()='View Courses']")).click();
        driver.navigate().back();
        driver.navigate().to("https://ultimateqa.com/automation/fake-pricing-page/");
	    //p
        driver.navigate().back();
        driver.navigate().to("https://ultimateqa.com/filling-out-forms/");
        driver.findElement(By.cssSelector("#et_pb_contact_name_0")).sendKeys("Nandini");
        driver.findElement(By.cssSelector("#et_pb_contact_message_0")).sendKeys("I am working with BSIT, i Am software Test Engg");
	    driver.findElement(By.cssSelector("#et_pb_contact_name_1")).sendKeys("Prathusha");
	    driver.findElement(By.cssSelector("#et_pb_contact_message_1")).sendKeys("I am mother of Ashwika");
	    driver.navigate().back();
	    driver.navigate().to("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");
	    
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nandini");
	  driver.findElement(By.cssSelector("#submitForm")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//a[text()='Go to the next sprint']")).click();
	  driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Nandini");
	  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Giri");
	  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//a[text()='Go to sprint 3']")).click();
	  driver.findElement(By.xpath("//input[@value=\"female\"]")).click();
	  driver.navigate().back();
	  driver.navigate().to("https://courses.ultimateqa.com/users/sign_in");
	  
	  
	  
	
	}
	


}
