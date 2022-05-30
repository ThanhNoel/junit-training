package junit4.api.suite;

import junit4.Parameter1Tests;
import junit4.TimeOutTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Parameter1Tests.class, TimeOutTests.class})
public class TestSuite01 {
}
