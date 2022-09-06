package seleniumbyRavi;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetNoofLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); 	 //limiting webdriver scope	
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			
		String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); // important line
		
		columndriver.findElements( By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		
		Thread.sleep(1000);
		} // all the tab open with help of for loop
		
		Set<String > abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		}
}
