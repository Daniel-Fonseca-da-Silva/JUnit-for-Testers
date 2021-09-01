package exercise6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercise1.MyFirstTest;
import exercise2.ValidationTrueFalse;
import exercise3.ValidationEqual;
import exercise4.AfterAndBeforeConditionOfTest;
import exercise5.BeforeAndAfterConditionOfClass;

@RunWith(Suite.class)
@SuiteClasses({ MyFirstTest.class, ValidationTrueFalse.class, ValidationEqual.class,
		AfterAndBeforeConditionOfTest.class, BeforeAndAfterConditionOfClass.class })
public class TestSuite {

}
