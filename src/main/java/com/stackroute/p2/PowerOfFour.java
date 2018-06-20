package com.stackroute.p2;

public class PowerOfFour {
    
    String powerFour(String str) {
    	if(str.isEmpty()) {
    		return null;
    	}
    	int number;
    	try {
    		number=Integer.parseInt(str);
    	}
    	catch(NumberFormatException ne) {
    		return "Not a number";
    	}
    	while(number!=1) {
    		if(number%4 !=0) {
    			return "Not a power of 4";
    		}
    		number=number/4;			
    	}
    	return "Power of 4";
    }
    
    public static void main(String[] args) {
    	PowerOfFour pf=new PowerOfFour();
    	System.out.println(pf.powerFour("bhjhk"));
    }
}
