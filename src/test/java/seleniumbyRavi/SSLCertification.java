package seleniumbyRavi;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//options.addEncodedExtensions("");
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability(null, proxy);
		
		
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", "/directory/path"); // 
		
		
		WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();
		
		
		
		
		driver.get("https://expired.badssl.com/");
		driver.getTitle();
		
		

	}

}
