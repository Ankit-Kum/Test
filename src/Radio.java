import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ankit-kum.github.io/Radio.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		boolean sel = checkbox.isSelected();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"vehicle2\"]"));
		boolean sel2 = checkbox2.isEnabled();
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"vehicle3\"]"));
		boolean sel3 = checkbox3.isDisplayed();
		//driver.findElement(By.xpath("//*[@id=\"vehicle2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"vehicle3\"]")).click();
		if (sel == false ) {
			checkbox.click();
		}
		if (sel2 == true ) {
			checkbox2.click();
		}
		if (sel3 == true ) {
			checkbox3.click();
		}
		
	}

}
