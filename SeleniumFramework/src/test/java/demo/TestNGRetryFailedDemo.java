package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1() {
		System.out.println("I'm inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I'm inside test 2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I'm inside test 3");
		Assert.assertTrue(0>1);
}
}
