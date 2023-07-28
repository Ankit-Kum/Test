
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Four {
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();

	   driver.get("https://www.facebook.com");
		
	   // Find elements using tag name
	   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		
	   if(allInputElements.size() != 0) 
	   {
		   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
			
		   for(WebElement inputElement : allInputElements) 
		   {
			   System.out.println(inputElement.getAttribute("placeholder"));
		   }
	   }
   }
}