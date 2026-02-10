package practice0512;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pr051225 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spcentral.amazon.in/ap/signin?clientContext=259-9843879-4701529&openid.return_to=https%3A%2F%2Fspcentral.amazon.in%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_spc_desktop_in&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_spc_desktop_in&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("nnagtode817@gmail.com");
        driver.findElement(By.cssSelector("span#continue")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("Nandinis@12345");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
    	
	
	
	
	}

}
