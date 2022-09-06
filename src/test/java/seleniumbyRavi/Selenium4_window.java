package seleniumbyRavi;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4_window {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		driver.get("https://www.rahulshettyacademy.com/");
		String courseName = driver.findElements(By.xpath("//div[@id=\"courses-block\"]/div/div/div/div/h2/a")).get(6)
				.getText();
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		File File = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(File, new File("logo.png"));
		
		System.out.println(courseName);
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	
		driver.quit();

	}

}
