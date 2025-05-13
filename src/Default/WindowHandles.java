package Default;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.appium.java_client.android.AndroidDriver;

class WindowHandles{  

	public static void main(String[] args) {  

		System.out.println("Start");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
		driver.get("https://www.tatacliq.com/login");
		
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.id("mobileNumber"))).isDisplayed();
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		
		driver.findElement(By.id("continueBtn")).click();
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_1QkvjKmotiAnmNla2v6SJr']"))).isEnabled();

		driver.findElement(By.xpath("//div[@class='_1QkvjKmotiAnmNla2v6SJr']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String ParentWindowID = it.next();
		System.out.println("First window ID : " + ParentWindowID);
		String ChildWindowId = it.next();
		System.out.println("Second Window ID : "+ ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		System.out.println("Child window title:" +driver.getTitle());
//		new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']"))).isDisplayed();
		driver.close();
		driver.switchTo().window(ParentWindowID);
//		new WebDriverWait(driver, 60L).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_1QkvjKmotiAnmNla2v6SJr']"))).isEnabled();
		System.out.println("Parent window title : "+driver.getTitle());
		
		driver.quit();
		System.out.println("Done");
	}
	

	
}