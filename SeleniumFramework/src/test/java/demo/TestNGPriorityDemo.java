package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority = 1)
	public void one() {
		System.out.println("I'm inside test1");
	}
	@Test(priority = 1)
	public void two() {
		System.out.println("I'm inside test2");
	}
	@Test(priority = 1)
	public void three() {
		System.out.println("I'm inside test3");
	}

}
