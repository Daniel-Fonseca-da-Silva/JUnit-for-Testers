package exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AfterAndBeforeConditionOfTest {
	
	@Before
	public void beforeCondition() {
		System.out.println("Executed the before test!");
	}
	
	@Test
	public void ExhibitionAfterAndBeforeCondition1() {
		System.out.println("Executed the test1!");
	}
	
	@Test
	public void ExhibitionAfterAndBeforeCondition2() {
		System.out.println("Executed the test2!");
	}
	
	@After
	public void afterCondition() {
		System.out.println("Executed the after test!");
	}
}
