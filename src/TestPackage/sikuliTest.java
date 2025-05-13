package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuliTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		
		Pattern signnInBtn = new Pattern("C:\\Users\\vijay\\Downloads\\TestingProject\\TestingProject\\SignInBtn.png");
		s.wait(signnInBtn,2000);
		s.click(signnInBtn);
		
		
	}

}
