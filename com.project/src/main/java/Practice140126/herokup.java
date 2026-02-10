package Practice140126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class herokup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        //checkbox
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement check = driver.findElement(By.cssSelector("#checkbox-2"));
        check.click();
        
        //date picker
        driver.navigate().to("https://formy-project.herokuapp.com/datepicker");
        WebElement date = driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("14/01/2026");
        
        //drag and drop
        driver.navigate().to("https://formy-project.herokuapp.com/dragdrop");
        WebElement source = driver.findElement(By.xpath("//div[@id='image']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='box']"));
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        //dropdown
        driver.navigate().to("https://formy-project.herokuapp.com/dropdown");
        
        //click dropdown button
        WebElement drop = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
        drop.click();
        
        // click datepicker option from list
        WebElement dat = driver.findElement(By.xpath("//a[text()='Datepicker']"));
        date.click();
        
        //Enabled and disabled element
        driver.navigate().to("https://formy-project.herokuapp.com/enabled");
        WebElement enb = driver.findElement(By.xpath("//input[@id='disabledInput']"));
        WebElement dis = driver.findElement(By.xpath("//input[@id='input']"));
        WebElement disabledInput;
		//check disabled input
     //   if (!disabledInput.isEnabled())  {
       // 	System.out.println("Disable input is NOT enabled");
     //   }

        /*check enabled input and send text
        
        Object enabledInput;
		if (enabledInput.isEnabled() {
        	enabledInput.sendkeys("Hello");
        	System.out.println("text enter is  enabled");
        }
        
        
        
          driver.quit();
	*/
	}

}
