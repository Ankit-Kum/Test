import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/apple/Desktop/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		//www.google.com
		//driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.className("gNO89b")).click();
		//driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		//driver.close();	
		System.out.println("Ok guys see you after break");
		//driver.close();		
		
}

}
