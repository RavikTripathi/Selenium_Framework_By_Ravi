package seleniumbyRavi;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(null)).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(null); // select all the option coming from dropdown
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				
				option.click();
				break;
			}
			
		}
		
		

	}

}
