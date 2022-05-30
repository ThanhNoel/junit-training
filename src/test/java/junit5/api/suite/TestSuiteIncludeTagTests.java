package junit5.api.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("junit5")
@IncludeTags("TEST_MAC")
public class TestSuiteIncludeTagTests {
}
