import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in"); // replace with your target page

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			// Skip if it's null, empty, or javascript/mailto links
			if (url == null || url.isEmpty() || url.startsWith("javascript") || url.startsWith("mailto")) {
				continue;
			}

			try {
				HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
				connection.setRequestMethod("HEAD");
				connection.connect();

				int statusCode = connection.getResponseCode();

				if (statusCode >= 400) {
					System.out.println("❌ Broken Link: " + url + " -> Status: " + statusCode);
				} else {
					System.out.println("✅ Valid Link: " + url + " -> Status: " + statusCode);
				}

			} catch (Exception e) {
				System.out.println("⚠️ Error checking link: " + url + " -> " + e.getMessage());
			}
		}

		driver.quit();
	}
}
