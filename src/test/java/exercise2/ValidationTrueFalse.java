package exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidationTrueFalse {
	
	@Test
	public void validationTrueSuccessfully() {
		boolean fieldIsPresent = true;
		assertTrue(fieldIsPresent);
	}
	
	@Test
	public void validationTrueFail() {
		boolean fieldIsPresent = true;
		assertFalse("Field ins't present", fieldIsPresent);
	}
}
