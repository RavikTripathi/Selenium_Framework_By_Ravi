package seleniumbyRavi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		a.moveToElement(move).build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		
		Thread.sleep(2000);
		
		// Type -enter capital letter in search box 
		a.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		

		
		Thread.sleep(2000);
		
		

	}

}
