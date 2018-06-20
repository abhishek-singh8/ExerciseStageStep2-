package com.stackroute.p2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PowerOfFourTest {
	 PowerOfFour power;
	    @Before
	    public void setup(){
	        System.out.println("JUnit Call: @Before setUp");
	        power=new PowerOfFour();
	    }
	    @Test
	    public void numberFormatTest() {
	    	assertEquals(new String("Not a number"),power.powerFour("abshh"));
	    }
	    @Test
	    public void powerOfFourTest() {
	    	assertEquals(new String("Power of 4"),power.powerFour("64"));
	    	assertEquals(new String("Not a power of 4"),power.powerFour("23"));
	    }
	    @Test
	    public void testForNullTest() {
	    	assertNull("powerFour(), it will not give null when string is empty",power.powerFour(""));
	    }
}
