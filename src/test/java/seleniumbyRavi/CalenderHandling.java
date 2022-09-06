package seleniumbyRavi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.path2usa.com/travel-companion/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		// Month name and Date name provide --> April 14
		
		WebElement el = driver.findElement(By.xpath("//input[@id=\"form-field-travel_comp_date\"]"));
		
		
		
		
		System.out.println(el.getText());
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class=\"dayContainer\"]"));
		
		int count = driver.findElements(By.xpath("//div[@class=\"dayContainer\"]")).size();
		
		for(int i=0;i<count;i++) {
			
			 String text = driver.findElements(By.xpath("//div[@class=\"dayContainer\"]")).get(i).getText();
			
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//div[@class=\"dayContainer\"]")).get(i).click();
				break;
				
			}
			
			
		}
		Thread.sleep(5000);
		
		
		
	}

}
