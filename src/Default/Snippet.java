package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	
	
	public static int valueToEnter = 0;
	public static void sleep(int time)
		{
			try
			{
				Thread.sleep(time);
			}
			catch (InterruptedException e)
			{
				System.out.println("********Unable to wait *******************");
			}
		}
	public static void press(String str){
		
	}
}

