package CreateTestng.CreateTestng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = 2 , enabled=false)
	public  void we () {
		System.out.println("we;vp");
	}
	
	@Ignore
	
	@Test(priority = 0, enabled=true)
	public  void we2 () {
		System.out.println("noway");
	}
	@Test(priority = 3)
	public  void we5 () {
		System.out.println("w4");
	}



}
