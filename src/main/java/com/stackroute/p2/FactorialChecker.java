package com.stackroute.p2;

public class FactorialChecker {
    
	public void integerFactorialList() {
	  int initial=1;
	  int factorial = 1;
	  
      while (true)
      {
          System.out.println("The factorial of " +initial+" is "+factorial);
          if (Integer.MAX_VALUE / factorial < (initial+1)) {
        	  longFactorialList(initial,factorial);
        	  
              break;
          }
          initial++;
          factorial *= initial;
      }
 }
	 public void longFactorialList(int initialInput,int factorialInput) {
		  long initial=initialInput;
		  long factorial = factorialInput;
		  final long maxValue=Long.MAX_VALUE;
		  
	      while (true)
	      {
	         
	          if (maxValue / factorial < (initial+1)) {
	              System.out.println("The factorial of "+(initial+1)+" is out of range" );
	              break;
	          }
	          initial++;
	          factorial *= initial;
	          System.out.println("The factorial of "+ initial+" is "+ factorial);
	      }
	 }
	 public static void main(String[] args) {
		 FactorialChecker fc=new FactorialChecker();
		 fc.integerFactorialList();
		// fc.longFactorialList();
	 }
}

