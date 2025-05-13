import java.sql.Driver;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StreamsSortingDemo {

	@Test
	public void streamSortingDemo() throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "/Users/vijay.aher/Documents/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();

		Thread.sleep(2000);

		List<WebElement> elementsList = driver.findElements(By.xpath("//tr//td[1]"));

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		originalList.stream().forEach(s -> System.out.println(s));

		sortedList.stream().forEach(s -> System.out.println(s));

		List<String> price;

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr//td[1]"));
			price = rows.stream().filter(s -> s.getText().equalsIgnoreCase("cherry")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(s -> System.out.println(s));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				Thread.sleep(2000);

			}
		} while (price.size() < 1);

		Thread.sleep(2000);

//		Assert.assertTrue(originalList.equals(sortedList));

		driver.quit();

	}
	
	public static String getPriceVeggie(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td")).getText();

		return priceValue;
	}

}
