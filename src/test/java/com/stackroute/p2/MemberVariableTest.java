package com.stackroute.p2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MemberVariableTest {
	    
	    private static MemberVariable memberVariable;
	    private static Member member;
	    @Before
	    public  void setup() {
	        member = new Member();
	        memberVariable = new MemberVariable();
	        //memberVariable.setMemberVariable("Harry Porter",23,50000);
	    }
	    
	    @Test
	    public void testMemberValues() {
	    member = memberVariable.createMemberInstance("Harry Porter",23,50000);
	    assertEquals("Harry Porter", member.getName());
	    assertEquals(23, member.getAge());
	    assertEquals(50000, member.getSalary());
	    }

}
