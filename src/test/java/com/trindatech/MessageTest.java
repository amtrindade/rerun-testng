package com.trindatech;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class MessageTest {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testOne() {
		System.out.println("One test");
		assertTrue(false);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testTwo() {
		System.out.println("Two test");
		assertTrue(true);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testThree() {
		System.out.println("Three test");
		assertTrue(true);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testFour() {
		System.out.println("Four test");
		assertTrue(false);
	}
}
