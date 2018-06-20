package com.stackroute.p2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ReverseAndPalindromeCheckerTest {
	 ReverseAndPalindromeChecker reversePalindrome;
	    @Before
	    public void setup(){
	        System.out.println("JUnit Call: @Before setUp");
	        reversePalindrome=new ReverseAndPalindromeChecker();
	    }
	    @Test
	    public void reverseInputTest() {
	    
	    	assertEquals("reverseInput(),Reversing the string doesn't return correct value "
					, new String("kehsihba"), reversePalindrome.reverseInput("abhishek"));    	
	    }
	    @Test
		public void reverseInputFailure()
		{
	        assertNotNull("testReverseInputfailure() , Reverse function returns null value", reversePalindrome.reverseInput("abhi343ihba"));
						
		}
	    @Test
	    public void reverseInputNullTest() {
	    assertNull(
				"testReverseInputNullTest() :Retrieval of reverseInput failed. Check reverseInput() method",
				reversePalindrome.reverseInput(""));
            }
	    @Test
	    public void palindromeTest() {
	    	assertEquals("palindrometest(),Checking the palindrome gives incorrect"
					, new String("aabbaa is a palindrome"), reversePalindrome.palindromeTest("aabbaa")); 
	    	assertEquals("palindrometest(),Not a palindrome result is incorrect"
					, new String("abhishek is not a palindrome"), reversePalindrome.palindromeTest("abhishek"));
	    }
	    @Test
	    public void palindromeNullTest() {
	    assertNull(
				"testPalindromeNullTest() :Retrieval of palindrome failed. Check palindromeInput() method",
				reversePalindrome.palindromeTest(""));
            }
}
