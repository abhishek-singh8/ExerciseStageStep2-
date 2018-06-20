package com.stackroute.p2;

public class Factorial32BitChecker {

	public String factorialTesting(String input) {
		int numberFact;
		try {
			numberFact=Integer.parseInt(input);
		}catch(NumberFormatException nfe) {
			return "Please enter a number";
		}
		if(numberFact>12) {
			return "The factorial of "+input+" is out of range";
		}
		else {
			return "The factorial of "+numberFact+" is "+(factorial(numberFact));
			
		}
	}
	  public int factorial(int input) {
		  if(input==1) {
			  return  1;
		  }
		  else {
			  return input*factorial(input-1);
		  }
	  }
	  public static void main(String[] args) {
		  Factorial32BitChecker f=new Factorial32BitChecker();
		  System.out.println(f.factorialTesting("12"));
	  }
}
