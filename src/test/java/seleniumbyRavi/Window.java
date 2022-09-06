package seleniumbyRavi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Set <String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		

	}

}
