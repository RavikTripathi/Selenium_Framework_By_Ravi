package seleniumbyRavi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		//document.querySelector(".tableFixHead").scrollTop=5000
		
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum= 0;
		for(int i=0;i<values.size();i++) {
		sum = sum+Integer.parseInt(values.get(i).getText()); //51
			
		}
		System.out.println(sum);
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(total, sum);
		
		
	}

}
