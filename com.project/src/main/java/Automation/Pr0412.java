package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr0412 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.findElement(By.cssSelector("input[maxlength='10']")).sendKeys("ATHANG");
        driver.findElement(By.cssSelector("input[maxlength='15']")).sendKeys("GIRI");
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[2]/div/div/div/div/article/div/div/form/div/input[3]")).sendKeys("NNagtode817@GMAIL.COM");
        driver.findElement(By.xpath("(//input[@type='password'][1])")).sendKeys("Athang@123");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Athang@123");
        driver.findElement(By.xpath("(//button[text()='Register'])")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[2]/div/div/div/div/article/div/div/table/tbody/tr[2]/td/input")).click();
        driver.findElement(By.xpath("//td[text()='Maria Anders']/following-sibling::td/a[text()='Click']")).click();
	
	}
} 
	