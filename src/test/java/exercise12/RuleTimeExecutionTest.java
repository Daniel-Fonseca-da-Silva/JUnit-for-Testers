package exercise12;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RuleTimeExecutionTest {
	
	@Rule public Timeout timeoutGlobal = Timeout.seconds(1);
	@Test
	public void failureByTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
	
}
