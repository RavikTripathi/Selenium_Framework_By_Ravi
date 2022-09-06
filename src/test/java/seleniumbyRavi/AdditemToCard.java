package seleniumbyRavi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdditemToCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		// expected array declared of vegetable list
		String itemsNeeded []= {"cucumber","brocolli"}; // 
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products=driver.findElements(By.xpath(""));
		for(int i=0;i<products.size();i++) {
			String name[] = products.get(i).getText().split("-");
			String Vegetable =name[0].trim();
			
			
			// convert array into array list for easy search.
			// to check whether name you extracted is present in array or not.
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(Vegetable)) {
				driver.findElements(By.xpath("")).get(i).click();
				
				
				
			}
		}
		

	}

}
