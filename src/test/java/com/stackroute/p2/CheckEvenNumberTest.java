package com.stackroute.p2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CheckEvenNumberTest {
	CheckEvenNumber even ;
	  @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        even=new CheckEvenNumber();
	    }
	  @Test
	  public void numberFormatTest() {
		  assertEquals(new String("Not a number"),even.numberFormatChecker("ab23"));
	  }
	  @Test
	  public void nullNumberFormat() {
		  assertNull(even.numberFormatChecker(""));
	  }
	  @Test
	  public void isEvenTest() {
		  assertTrue(CheckEvenNumber.isEven(34));
	  }
	  @Test
	  public void isNotEvenTest() {
		  assertFalse(CheckEvenNumber.isEven(23));
	  }
}
