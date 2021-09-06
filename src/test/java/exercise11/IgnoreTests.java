package exercise11;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTests {

	@Test
	public void test1() {

	}

	@Test
	@Ignore
	public void test2() {

	}

	@Test
	@Ignore(value = "Test ignored with reason")
	public void test3() {

	}

}
