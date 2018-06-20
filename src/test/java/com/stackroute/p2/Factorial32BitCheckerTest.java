package com.stackroute.p2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Factorial32BitCheckerTest {
  
	Factorial32BitChecker fact;
	@Before
	public void setup() {
		fact=new Factorial32BitChecker();
	}
	@Test
	public void numberFormatCheckTest() {
		assertEquals(new String("Please enter a number"),fact.factorialTesting("abc"));
	}
	@Test
	public void outOfRangeTest() {
		assertEquals(new String("The factorial of 13 is out of range"),fact.factorialTesting("13"));
	}
	@Test
	public void factorialCheckTest() {
		assertEquals(new String("The factorial of 12 is 479001600"),fact.factorialTesting("12"));

	}
}
