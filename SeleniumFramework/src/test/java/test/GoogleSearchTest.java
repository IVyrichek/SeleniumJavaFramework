package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();

	}
	public static void googleSearch() {
		//String projectPath = System.getProperty("user.dir");
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/Users/dmytro.krasnikov/Desktop/I/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("abc");
		
		//driver.findElement(By.name("q")).sendKeys("abc");
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test completed");
		
		
	}
}
