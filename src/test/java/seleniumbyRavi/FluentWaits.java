package seleniumbyRavi;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@id=\"start\"]//button[contains(text(),'Start')]")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);
		//WebElement Ele =driver.findElement(By.xpath("//div[@id=\"finish\"]//h4[contains(text(),'Hello World!')]"));
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			
		     public WebElement apply(WebDriver driver) {
		    	 if (driver.findElement(By.xpath("//div[@id=\\\"finish\\\"]//h4[contains(text(),'Hello World!')]")).isDisplayed());
		    	 { 
		       return driver.findElement(By.xpath("//div[@id=\"finish\"]//h4[contains(text(),'Hello World!')]"));
		     }
		    	 	
		    	 }
		   });

		System.out.println(driver.findElement(By.xpath("//div[@id=\\\"finish\\\"]//h4[contains(text(),'Hello World!')]")).isDisplayed());
	}

}
