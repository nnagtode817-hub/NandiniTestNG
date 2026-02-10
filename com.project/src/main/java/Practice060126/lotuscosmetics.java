package Practice060126;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lotuscosmetics {

	public static void main(String[] args)  {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lotusherbals.com");
        Actions login = new Actions(driver);
        login.moveToElement(driver.findElement(By.xpath("//summary[text()='MAKE-UP']"))).build().perform();
        
        
	     //auto suggestion
	    
	    List<WebElement> as = driver.findElements(By.xpath("//li[@data-title='Combos']"));
	    System.out.println("list the size of Auto suggestion"   +as.size());
	    for(WebElement as1 : as)  {
	    	System.out.println("Name of combos suggestions"   +as1.getText());
	    	if(as1.getText().equalsIgnoreCase("Herbals")) {
	    		as1.click();
	    		break;
	    	}
	    }
	
	    
	    //FRAME
	    
	    

	
		
       
	}

	private static Object switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
	}


