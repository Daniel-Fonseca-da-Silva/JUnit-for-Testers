package exercise12;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeExecutionTest {

	@Test(timeout = 1000)
	public void dontEnterInTimeout() {
		assertTrue(true);
	}
	
	@Test(timeout = 1000)
	public void errorInTimeout() throws InterruptedException {
		Thread.sleep(1002);
	}

}
