package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();

	}
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/dmytro.krasnikov/Desktop/I/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("abc");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test completed");
		
		
	}
}
