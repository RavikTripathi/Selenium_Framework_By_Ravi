package seleniumbyRavi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.alaskaair.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// global wait - applicable all the element 
		
		// Explicit wait that is conditional wait applicable for particular element.
		driver.findElement(By.xpath("//input[@id=\"fromCity1\"]")).sendKeys("Pune");
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// only apply targeted element so performance is good
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"fromCity1\"]"))).getText();
		wait.until(ExpectedConditions.urlToBe("https://www.alaskaair.com/")).booleanValue();
		
		
		
		

	}

}
