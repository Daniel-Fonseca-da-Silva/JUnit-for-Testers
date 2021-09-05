package exercise10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import vote.VoteAge;

@RunWith(JUnitParamsRunner.class)
public class ValidationByAgeCSV {

	@Test
	@FileParameters(value = "src/test/resources/mass_data.csv", 
	mapper = CsvWithHeaderMapper.class)
	public void validationMandatoryOfVote(String name, int birthday, String result) {
		assertEquals(result, VoteAge.canVote(name, birthday));
	}

}
