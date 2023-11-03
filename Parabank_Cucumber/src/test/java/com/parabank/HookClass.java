package com.parabank;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
@Before
public static void setUp() {
	HelperClass.getDriver();
}

@After
public static void tearDown() {
	
	HelperClass.tearDown();
}
}
