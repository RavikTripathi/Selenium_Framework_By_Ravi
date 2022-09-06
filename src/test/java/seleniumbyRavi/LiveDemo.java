package seleniumbyRavi;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedList =originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
	}

}
