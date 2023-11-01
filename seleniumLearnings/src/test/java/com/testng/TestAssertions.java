package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestAssertions {
  @Test
  public void testAssertions() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG";
	  String str5 = "TestNG";
	  String str6 = new String("Not TestNG");
	   int val1 =5;
	   int val2 =6;
	   SoftAssert soft =new SoftAssert();
	   soft.assertTrue(val1==val2);
	    System.out.println("True Asseration isw sucessful");
	   //check that two object are equal
	    soft.assertEquals(str1, str2);
	   System.out.println("Equals Assertion is sucessful");
	   //check that two object are not equal
	   soft.assertNotEquals(str1, str6);
	    System.out.println("NotEqual Asserations is sucessfull");
	    
	    //check that a condition is true
	    
	   
	    
	    
//	    Assert.assertTrue(val1<val2);
//	    System.out.println("True Asseration isw sucessful");
	   
	  
	    soft.assertFalse(val1>val2);
	    System.out.println("False Asseration is sucessfull");
	    
	    soft.assertNotNull(str1);
	    System.out.println("Not Null Asseration is successful");
	    
	    soft.assertSame(str4, str5);
	    System.out.println("Same Assertion is successful");
	    
	    soft.assertNotSame(str1,str3);
	    System.out.println("Not same Asseration is sucessfull");
	    soft.assertNull(str3);
	    soft.assertAll();
  }
}
