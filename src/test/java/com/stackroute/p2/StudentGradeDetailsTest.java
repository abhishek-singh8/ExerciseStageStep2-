package com.stackroute.p2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentGradeDetailsTest {

	StudentGradeDetails student;
	int[] arr;
	
	@Before
	public void setup() {
		 arr=new int[] {89,78,76,85};
	    student=new StudentGradeDetails();
	}
    @Test
    public void validSizeInputTest() {
    	
    	assertEquals(new String("Please enter some number as input"),student.gradeTest("asbx", arr));
    }
    @Test
    public void emptySizeInputTest() {
    	int[] arr=new int[] {};
    	assertNull(student.gradeTest("0", arr));
    }
    @Test
    public void inputRangeCheck() {
    	int[] arr=new int[] {230,89,83,920};
    	assertEquals(new String("Please enter a valid input in range"),student.gradeTest("4", arr));
    }
    @Test 
    public void findAveragecheck() {
    	assertEquals(new String("Average marks is 82"),student.findAverage(4, arr));
    }
    @Test
    public void findMinimumtest() {
    	assertEquals(new String("The Minimum marks is 76"),student.findMin(4, arr));
    }
    @Test
    public void findMaximumtest() {
    	assertEquals(new String("The Maximum marks is 89"),student.findMax(4, arr));
    }
}
