package com.stackroute.p2;

public class CheckEvenNumber {
     
	public String numberFormatChecker(String inputNumber) {
		if(inputNumber.isEmpty()) {
			return null;
		}
		else {
			int number;
			try {
				number=Integer.parseInt(inputNumber);
			}catch(NumberFormatException nfe) {
				return "Not a number";
			}
			if(isEven(number)) {
				return "Even Number";
			}else {
				return "Not Even Number";
			}
		}
	}
	public static boolean isEven(int inputNumber) {
		if(inputNumber%2==0) {
			return true;
		}
		else {
			return false;
		}	
	}
}
