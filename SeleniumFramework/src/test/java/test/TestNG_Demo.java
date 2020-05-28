package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName=null;
	
	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome")) { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) { 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		
	}
	
	@Test
	public void googleSearch() {
		//String projectPath = System.getProperty("user.dir");
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/dmytro.krasnikov/Desktop/I/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		
		
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("abc");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test completed");
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed");
		
	}
	
}
