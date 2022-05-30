package junit5.api.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("junit5")
@ExcludeTags("TEST_MAC")
public class TestSuiteExcludeTagTests {
}
