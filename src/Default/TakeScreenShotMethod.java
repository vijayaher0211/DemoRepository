package Default;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenShotMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System. setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
		//driver.get("https://www.tatacliqq.com/login");
		driver.get("https://www.tatacliq.com/");
		
		 //Take screen shot method
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);

		//Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile = new File("C:\\Users\\Vijay\\Desktop\\ScreenShots\\ss.png");
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot not captured");
		}
		System.out.println("Done");
		driver.quit();
 
		
		
	}

}
