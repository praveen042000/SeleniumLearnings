package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Annotations1 {
  @Test
  public void validation() {
	  System.out.println("logout");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @AfterSuite
  public void aftersuite() {
	  System.out.println("afer suite");
  }
  
  public void beforesuite() {
	  System.out.println("before suite");
  }
}
