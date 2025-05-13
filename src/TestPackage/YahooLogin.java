package TestPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/manage_account?pspid=2114723002&activity=header-mail&.lang=en-IN&.intl=in&src=ym&signin=true&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&eid=100");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).isDisplayed();
		driver.findElement(By.name("username")).sendKeys("vijayaher0211@yahoo.com");
		driver.findElement(By.name("signin")).click();
		
		driver.findElement(By.name("password")).sendKeys("quark@123");
		
		driver.findElement(By.name("verifyPassword")).click();
		
		
		
		
		
		
	}

}
