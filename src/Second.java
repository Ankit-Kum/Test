import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Second {
	
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
	   driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	public void productserach() throws InterruptedException {
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bose");
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");

		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[4]")).click();
		//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]")).click();
		////*[contains(text(),'ABC')]
		driver.findElement(By.xpath("//*[contains(text(),'Best Sellers')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("New Releases")).click();
	}
	;
	public void navigate() throws InterruptedException {
		driver.navigate().to("https://www.cdac.in");
		System.out.println("The Title is => "+ driver.getTitle());
		driver.navigate().to("https://www.gmail.com");	
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com");	
		
	}
	public void facebookaut() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("a2gmail.com");
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
	}
	
	;
	public void browserclose() {
		
		driver.quit();
}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Second ob = new Second();
		ob.launch();
		ob.productserach();
		ob.navigate();
		ob.facebookaut();
		ob.browserclose();
		
		
	}

}
