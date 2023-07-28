import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/login");
		WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement pass =driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement login =driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button"));
	
		
		user.sendKeys("abc@gmail.com");
		pass.sendKeys("anc123");
		login.click();
		
		String url = "https://www.linkedin.com/login" ;
		String experUrl = driver.getCurrentUrl();
		System.out.println("after login url " + experUrl);
		
		if (url.equalsIgnoreCase(experUrl)) 
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
