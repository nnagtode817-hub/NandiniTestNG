package Practice090226;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLocator {
WebDriver driver;

//constructor

public MyLocator(WebDriver driver) {
	this.driver = driver;		
}
//xpath
By textInputLink = By.xpath("//a[text()='Text input']");
By inputBox = By.xpath("//input[@name='text_string']");
By requirement = By.id("req_header");




}



