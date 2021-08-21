package exercise5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterConditionOfClass {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executed before of all methods!");
	}

	@Before
	public void beforeTest() {
		System.out.println("Executed before the test");
	}

	@Test
	public void test1() {
		System.out.println("Executed the test1");
	}

	@Test
	public void test2() {
		System.out.println("Executed the test2");
	}
	
	@After
	public void afterTest() {
		System.out.println("Executed after the test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Executed after of all methods!");
	}

}
