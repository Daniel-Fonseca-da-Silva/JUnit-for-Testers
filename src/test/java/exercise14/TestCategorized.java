package exercise14;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.Positives;
import categories.Smoke;

public class TestCategorized {
	
	@Test
	@Category(Smoke.class)
	public void test1() {
		
	}
	
	@Test
	@Category(Positives.class)
	public void test2() {
		
	}
	
	@Test
	public void test3() {
		
	}
	
}
