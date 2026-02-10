package Practice171225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Select color= new Select(driver.findElement(By.id("oldSelectMenu")));
		color.selectByValue("4");
		
		
		//multiple
		Select mname = new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		mname.selectByValue("saab");
		mname.selectByVisibleText("Volvo");
		
		
	}
	
}