package com.stackroute.p2;
import java.util.Arrays;

public class StudentGradeDetails {

	    public String gradeTest(String size,int[] arr) {
	    	
	    	int arrSize;
	    	
	    	try {
	    		arrSize=Integer.parseInt(size);
	    		if(arrSize==0) {
		    		return null;
		    	}
	    	}
	    	catch(NumberFormatException ne) {
	    		return "Please enter some number as input";
	    	}
	    	int sum=0;
	    	for(int i=0;i<arrSize;i++) {
	    		if(arr[i]>=0 && arr[i]<=100) {
	    			sum=sum+arr[i];
	    		}
	    		else {
	    			return "Please enter a valid input in range";
	    		}
	    	}
	    	findAverage(arrSize,arr);
	    	findMin(arrSize,arr); 
	    	findMax(arrSize,arr);
	    	return "";
	    }
	    String findAverage(int size,int[] arr) {
	    	int sum=0;
	    	for(int i=0;i<size;i++) {
	    			sum=sum+arr[i];
	    	}
	    	return "Average marks is " + sum/size;
	    }
	    String findMin(int size,int[] arr) {
	    	Arrays.sort(arr);
	    	return "The Minimum marks is "+ arr[0];
	    }
	    String findMax(int size,int[] arr) {
	    	Arrays.sort(arr);
	    	return "The Maximum marks is "+arr[size-1];
	    }
//	    public static void main(String[] args) {
//	    	StudentGradeDetails s=new StudentGradeDetails();
//	    	int[] arr=new int[]  {89,78,76,85};
//	    	System.out.println(s.findAverage(4, arr));
//	    }
}
