package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenUdemyAPICourse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://qualitykioskorg.udemy.com/course/rest-api-automation-testing-rest-assured/learn/lecture/26865374#questions");
		
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Log')]"))).isDisplayed();
		
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		
		
		
	}

}
