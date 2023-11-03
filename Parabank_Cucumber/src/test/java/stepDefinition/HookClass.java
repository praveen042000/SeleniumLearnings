package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;


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
