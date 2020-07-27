package com.trindatech.test;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class MessageTest {
	
	@Test
	public void testOne() {
		System.out.println("One test");
		assertTrue(false);
	}
	
	@Test
	public void testTwo() {
		System.out.println("Two test");
		assertTrue(true);
	}
	
	@Test
	public void testThree() {
		System.out.println("Three test");
		assertTrue(true);
	}
	
	@Test
	public void testFour() {
		System.out.println("Four test");
		assertTrue(false);
	}
}
