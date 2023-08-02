package spraykart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automate {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spraykart.in/#/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("//input[@placeholder='Enter your email or mobile number']"));
		email.sendKeys("niranjanmogare@gmail.com");
		email.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter your Password']"));
	password.click();

	password.sendKeys("Pass@123");
	password.sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
	
	JavascriptExecutor scroll = (JavascriptExecutor)driver;
	 scroll.executeScript("window.scrollBy(0,1800)");
	 
	 driver.findElement(By.linkText("Know More")).click();
	 Thread.sleep(3000);
	 WebElement increase  =driver.findElement(By.xpath("//button[normalize-space()='+']"));
	 increase.click();
	 increase.click();
	 increase.click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
	 Thread.sleep(5000);
WebElement checkout = 	 driver.findElement(By.xpath("//h5[normalize-space()='Pay Now']"));
checkout.click();

	
	 
	 
	
	 
 Thread.sleep(10000);
	 driver.switchTo().frame("easebuzz-checkout-frame-125432253996");
 Thread.sleep(5000);
 driver.switchTo().defaultContent();
	 
	}
}
