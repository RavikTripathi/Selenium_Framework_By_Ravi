package seleniumbyRavi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Ravi");
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);

		driver.close();

	}

}
