package com.stackroute.p2;

public class Factorial64BitChecker {

	public String factorialTesting(String input) {
		int numberFact;
	    final long value=Long.MAX_VALUE;
		try {
			numberFact=Integer.parseInt(input);
		}catch(NumberFormatException nfe) {
			return "Please enter a number";
		}
	//	long factorialValue=factorial(numberFact);
		if(numberFact>0 && numberFact<13) {
			return "The factorial of "+numberFact+" is "+integerFactorial(numberFact);
		}
		else if(numberFact>12){
			return "The factorial of "+numberFact+" is "+longFactorial(numberFact);	
		}
		else {
			return "";
		}
	}
	 public int integerFactorial(int input) {
		  if(input==1) {
			  return  1;
		  }
		  else {
			  return input*integerFactorial(input-1);
		  }
	  }
	  public long longFactorial(long input) {
		  if(input==1) {
			  return  1;
		  }
		  else {
			  return input*longFactorial(input-1);
		  }
	  }
	  public static void main(String[] args) {
		  Factorial64BitChecker f=new Factorial64BitChecker();
		  System.out.println(f.factorialTesting("22"));
	  }
}
