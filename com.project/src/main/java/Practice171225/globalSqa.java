 package Practice171225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class globalSqa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Select country = new Select(driver.findElement(By.xpath("//li[text()='Select Country']")));	
	    country.selectByIndex(5);
	    country.selectByVisibleText("India");
	    country.selectByValue("IND");
	
	
	}

}
