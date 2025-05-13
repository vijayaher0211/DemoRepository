package TestPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootstrapDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		
		WebElement dropDownBtn = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'dropdown')]")));
		
		dropDownBtn.click();
		
		
		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//ul[contains(@class,'dropdown')]//label"));
		
		System.out.println(dropDownOptions.size());
		
		for(int i=0; i< dropDownOptions.size(); i++) {
			dropDownOptions.get(i).click();
		}
		
//		driver.quit();
		System.out.println("Done");
		
	}
	
	

}
