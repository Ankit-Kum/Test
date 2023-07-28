import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/apple/eclipse-workspace/Test/Radio.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		boolean sel = checkbox.isSelected();
		//driver.findElement(By.xpath("//*[@id=\"vehicle2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"vehicle3\"]")).click();
		if (sel == false ) {
			checkbox.click();
		}
		
	}

}
