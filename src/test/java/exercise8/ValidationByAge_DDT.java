package exercise8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import vote.VoteAge;

@RunWith(Parameterized.class)
public class ValidationByAge_DDT {

	// Attributes
	public String nome;
	public int birthday;
	public String result;

	// Constructor
	public ValidationByAge_DDT(String nome, int birthday, String result) {
		this.nome = nome;
		this.birthday = birthday;
		this.result = result;
	}

	// Test method
	@Test
	public void validationAgeVote() {
		assertEquals(result, VoteAge.canVote(nome, birthday));
	}

	@Parameters(name = " {0} | {1} | {2} ")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "Angela", 2007, "Angela you can't vote" },
				{ "Maria", 2006, "Maria you can't vote" }, { "Nikolai", 2005, "Nikolai your vote is optional" },
				{ "Jhon", 2004, "Jhon your vote is optional" }, { "Wendy", 2003, "Wendy your vote is mandatory" },
				{ "Paul", 1996, "Paul your vote is mandatory" }, { "Robert", 1951, "Robert your vote is mandatory" },
				{ "Jhony", 1950, "Jhony your vote is optional" } });
	}
}
