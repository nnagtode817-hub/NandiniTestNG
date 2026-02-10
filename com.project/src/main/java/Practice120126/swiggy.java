package Practice120126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swiggy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiggy.com/restaurants");
        WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
        sign.click();
        WebElement acc = driver.findElement(By.xpath("//a[text()='create an account']"));
        acc.click();
        WebElement phon = driver.findElement(By.cssSelector("#mobile"));
        phon.sendKeys("7972299279");
        WebElement name = driver.findElement(By.xpath("//input[@name='n	ame']"));
        name.sendKeys("Nandini");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("nnagtode817@gmail.com");
        WebElement con = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
        con.click();

	}

}
