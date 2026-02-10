package Practice050126;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dazzler {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dazller.co.in/");
		List<WebElement> con = driver.findElements(By.xpath("//ul[@class='site-nav site-navigation small--hide']//li"));
        System.out.println("size of navbar present in the dazzler website:" + con.size());
        for(WebElement con1 : con)
        {
        	System.out.println("names present in dazzler website in navbar:" + con1.getText());
        	if(con1.getText().equalsIgnoreCase("Contact Us"))
        	{
        		con1.click();
        		break;
        	}
        }
        driver.navigate().back();
		WebElement search= driver.findElement(By.xpath("//span[text()='Search']"));
				search.click();
		WebElement product= driver.findElement(By.xpath("//input[@name='q']"));
		product.sendKeys("Matte lipstik");

	}

}


