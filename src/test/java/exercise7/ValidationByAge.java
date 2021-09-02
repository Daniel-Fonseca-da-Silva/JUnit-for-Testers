package exercise7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vote.VoteAge;

public class ValidationByAge {

	@Test
	public void ageEqual15() {
		assertEquals("Maria you can't vote", VoteAge.canVote("Maria", 2006));
	}

	@Test
	public void ageEqual16Optional() {
		assertEquals("Nikolai your vote is optional", VoteAge.canVote("Nikolai", 2005));
	}

	@Test
	public void ageEqual17() {
		assertEquals("Jhon your vote is optional", VoteAge.canVote("Jhon", 2004));
	}

	@Test
	public void ageEqual18() {
		assertEquals("Wendy your vote is mandatory", VoteAge.canVote("Wendy", 2003));
	}

	@Test
	public void ageEqual25() {
		assertEquals("Paul your vote is mandatory", VoteAge.canVote("Paul", 1996));
	}

	@Test
	public void ageEqual70() {
		assertEquals("Robert your vote is mandatory", VoteAge.canVote("Robert", 1951));
	}

	@Test
	public void ageEqual71() {
		assertEquals("Jhony your vote is optional", VoteAge.canVote("Jhony", 1950));
	}
}
