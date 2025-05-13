package Default;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("D:\\Vijay\\TestingProjectWithoutFW\\src\\TestPackage\\config.properties");
		
		prop.load(ip);
		
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("Chrome")) {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		}
		
		driver.get(prop.getProperty("URL"));
		System.out.println("Done");
		driver.quit();
	}

}
