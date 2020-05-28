package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class TestNGIgnoreDemo {

	
	@Test
	@Ignore
	public void test1()
	{
		System.out.println("I'm inside test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I'm inside test 2");
	}
}
