package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Done");
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		JSExecutor(LoginButton, driver);
		driver.quit();
	}
	
	
	public static void JSExecutor(WebElement LoginButton, WebDriver driver) {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", LoginButton);
		
	}
	
	

}
