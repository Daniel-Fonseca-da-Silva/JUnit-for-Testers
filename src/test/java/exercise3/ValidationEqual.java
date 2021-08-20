package exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidationEqual {

	@Test
	public void validationWithSucceffuly() {
		String savedResult = "Registry saved with success!";
		assertEquals("Registry saved with success!", savedResult);
	}
	
	@Test
	public void validationWithFail() {
		String savedResult = "Registry deleted with success!";
		assertEquals("Registry saved with success!", savedResult);
	}

}
