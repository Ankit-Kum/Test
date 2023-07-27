import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {
	
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
	   driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	
	public void productserach() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bose");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("New Releases")).click();
	}
	
	public void navigate() throws InterruptedException {
		driver.navigate().to("https://www.cdac.in");
		System.out.println("The Title is => "+ driver.getTitle());
		driver.navigate().to("https://www.gmail.com");	
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com");	
		
	}
	public void facebookaut() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Second ob = new Second();
		ob.launch();
		ob.productserach();
		ob.navigate();
		ob.facebookaut();
		
	}

}
