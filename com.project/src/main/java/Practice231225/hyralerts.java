package Practice231225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyralerts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		// simple alert
	    driver.findElement(By.id("alertBox")).click();
	    //accept
	    driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	    // confirm
	    driver.findElement(By.id("confirmBox")).click();
	  //accept
	    driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	    //dismiss confirmation
	    driver.findElement(By.id("confirmBox")).click();
	    //dismiss
	    driver.switchTo().alert().dismiss();
	    System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	    //prompt
	    driver.findElement(By.id("promptBox")).click();
	    driver.switchTo().alert().sendKeys("Hi");
	    driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	    //dismiss
	    driver.findElement(By.id("promptBox")).click();
	    driver.switchTo().alert().sendKeys("Hi");
	    driver.switchTo().alert().dismiss();
	    System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	}
	
}