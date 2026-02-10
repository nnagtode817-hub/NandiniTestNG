package Practice090226;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyClass extends MyBase {
	
	@BeforeMethod
	public void verifyHomePage() {
		String title = driver.getTitle();
		System.out.println("page title is: "   +title);
	}

    @Test
    public void inputField() {
    	driver.findElement(By.xpath("//a[text()='Text input']")).click();	
    	driver.findElement(By.xpath("//input[@name='text_string']")).sendKeys("Athang Giri");
        driver.findElement(By.id("req_header")).click();
        
        System.out.println("Test Executed successfully");
    
    }
    
    







}