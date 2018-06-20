package com.stackroute.p2;

public class ReverseAndPalindromeChecker {
   
	String reverseInput(String str) {
	
	/* Reverse the given string. First convert the string to charArray reverse the charArray one by one and then 
	 * put the charArray back to the string.
	 */
		if(str.isEmpty()) {
			return null;
		}
		char[] charArray=str.toCharArray();
		int len=charArray.length;
		for(int i=0;i<len/2;i++) {
			char temp=charArray[len-i-1];
			charArray[len-i-1]=charArray[i];
			charArray[i]=temp;
		}
	/* Convert the reverse charArray back to the new String*/
		String reverseString=new String(charArray);
		return reverseString;
	}
	String palindromeTest(String str) {
		/*	To check for a palindrome the main idea is to check its reverseString and actual String if they
		 * are equal then it is palindrome
		*/		
		if(str.isEmpty()) {
			return null;
		}
		String reverseString=reverseInput(str);
		if(reverseString.equals(str)) {
			return str+" is a palindrome";
		}
		else {
			return str+" is not a palindrome";
		}
	}

}
