package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

	@SuppressWarnings("deprecation")
	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmytro.krasnikov\\Desktop\\I\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement =  driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
				
				//WebElement linkElement =  driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
			
			if (linkElement.isEnabled()) {
				System.out.println("Element found");
				
			}
			return linkElement;
			}
		});

		//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();

		element.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
