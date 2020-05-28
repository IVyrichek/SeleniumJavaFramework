import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		//driver.close();
		WebElement textBox = driver.findElement(By.className("gsib_a"));
		textBox.click();
		textBox.click();
		textBox.click();
		textBox.click();
		textBox.click();
		textBox.click();
		textBox.sendKeys("abc");
		Thread.sleep(3000);
		driver.close();
	}

}
