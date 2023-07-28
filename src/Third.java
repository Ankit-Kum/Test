import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third {
	
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
	   driver = new FirefoxDriver();
		driver.get("https://demoqa.com/radio-button");
	}
	
	public void radio() {
		
		WebElement radioEle = driver.findElement(By.id("yesRadio"));
		boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Third ob = new Third();
		ob.launch();
		ob.radio();
	}

}
