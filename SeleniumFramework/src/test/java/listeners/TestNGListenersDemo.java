package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenersDemo {

	@Test
	public void test1()
	{
		System.out.println("I'm inside test 1");
	}

	@Test
	public void test2()
	{
		System.out.println("I'm inside test 2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmytro.krasnikov\\Desktop\\I\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@name='q'")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abcd'")).sendKeys("abcd");
		driver.close();
	}

	@Test
	public void test3()
	{
		System.out.println("I'm inside test 3");
		throw new SkipException("This test is skipped");
	}
}
