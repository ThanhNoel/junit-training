package junit5.api.suite;

import junit5.AssertionTests;
import junit5.AssumptionTests;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({AssertionTests.class, AssumptionTests.class})
public class TestSuiteSelectedClassesTests {
}
