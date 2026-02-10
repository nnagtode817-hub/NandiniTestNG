package Practice171225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
        Select car= new Select(driver.findElement(By.id("cars")));
	    car.selectByVisibleText("Honda");
	    car.selectByValue("2");
	}

}