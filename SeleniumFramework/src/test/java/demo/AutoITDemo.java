package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmytro.krasnikov\\Desktop\\I\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://tinyupload.com/");
		System.out.println("open");
		WebElement element = driver.findElement(By.name("uploaded_file"));
		System.out.println(element);
		Thread.sleep(3000);
		element.sendKeys(Keys.RETURN);
		System.out.println("click");

		Runtime.getRuntime().exec("C:/Users/dmytro.krasnikov/Desktop/I/FileUploadScript.exe");

		Thread.sleep(3000);
		driver.close();
	}
}
