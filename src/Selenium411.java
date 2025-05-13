import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.openqa.selenium.By;

public class Selenium411 {
	
	@Test
	public void selenium411_Advanteges() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/vijay.aher/Documents/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
//		String label = driver.findElement(with(By.tagName("label")).above(By.cssSelector("[name='name']"))).getText();
//		
//		System.out.println(label);
		
//		driver.findElement(with(By.tagName("input")).below(By.cssSelector("[for='dateofBirth']"))).click();
//		
//		Thread.sleep(5000);

//		driver.findElement(By.xpath("//label[contains(text(),'IceCreams')]"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(driver.findElement(By.xpath("//label[contains(text(),'IceCreams')]")))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[value='option1']"));
		
		String radioLabel=driver.findElement(with(By.tagName("label")).toRightOf(driver.findElement(By.cssSelector("[value='option3']")))).getText();

		System.out.println(radioLabel);
		Thread.sleep(2000);

		driver.quit();
		
	}
}