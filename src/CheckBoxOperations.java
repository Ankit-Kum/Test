import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxOperations {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/apple/Desktop/ank/Checkbox.html");
		driver.manage().window().maximize();


		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.xpath("//*[@id=\"vehicle2\"]"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.xpath("//*[@id=\"vehicle3\"]"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

	}

}
	
