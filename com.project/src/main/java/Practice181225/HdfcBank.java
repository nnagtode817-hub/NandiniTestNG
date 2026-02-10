package Practice181225;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HdfcBank {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hdfc.bank.in/");
		
		driver.findElement(By.xpath("//div[@class='selector-wraplist productType option-box']")).click();	 
		List<WebElement> hd1= driver.findElements(By.xpath("//ul[contains(@class, 'options')]//li//a"));
        System.out.println("list of size:" + hd1.size());	
        for(WebElement hd2:hd1){
        	System.out.println("name of list:" + hd2.getText());
        	if(hd2.getText().equalsIgnoreCase("Credit Cards")) {
        		hd2.click();
        		break;
        	
        }
 
	}
driver.findElement(By.xpath("//a[@title= 'Select Product']")).click();
	List<WebElement> hd3 = driver.findElements(By.xpath("//ul[contains(@class,'options')]//li//a"));
	System.out.println("list of size:" + hd3.size());
	for(WebElement hd4:hd3) {
		System.out.println("name of list: "  + hd4.getText());
		if(hd4.getText().equalsIgnoreCase("Digital Cards")){
			hd4.click();
			break;
		}
	}
	
	
	
	}
}
