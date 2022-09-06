package seleniumbyRavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.spicejet.com/");
		// to know is enable or disable 
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']"
				+ "/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']"
				+ "/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']"
				+ "/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']"
				+ "/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']"
				+ "/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]/div[1]//*[name()='svg']"
				+ "//*[name()='g' and contains(@fill,'none')]//*[name()='circle'][1]")).click();
		driver.findElement(By.xpath(null));
	}
	

	

}
