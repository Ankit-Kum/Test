import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//www.google.com
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("gNO89b")).click();
		
	}

}
