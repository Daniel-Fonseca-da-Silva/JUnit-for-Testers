package exercise13;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ValidationsFluent {

	@Test
	public void validationEqualsTo() {
		String product = "tv with 40 screen mirroring";
		assertThat(product, equalTo("tv with 40 screen mirroring"));

	}

	@Test
	public void validationIs() {
		int age = 18;
		assertThat(age, is(18));
	}

	@Test
	public void validationAnyOf() {
		String result = "The most great sword in the world is in England";
		assertThat(result, anyOf(containsString("england"), containsString("England")));
	}

	@Test
	public void validationHasItems() {
		List<String> Listcryptocurrency = new ArrayList<String>();
		Listcryptocurrency.add("Cardano ada");
		Listcryptocurrency.add("VeChain VET");
		Listcryptocurrency.add("SHIBA INU SHIB");
		Listcryptocurrency.add("Tron TRX");

		assertThat(Listcryptocurrency, hasItem("Cardano ada"));
	}

}
