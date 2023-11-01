package com.extentreport_demo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setupDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		HelperClass.tearDown();
		
	}

}
