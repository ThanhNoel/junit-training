package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * When we use per class test instance life cycle
 * We doesn't need to use static for method source
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Parameter2Tests {
    @ParameterizedTest
    @MethodSource("dataProvider")
    @Tag("TEST_MAC")
    @DisplayName("Explicit method source")
    public void testValidMacAddressFromExplicitMethodSource(String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }

    public /*static*/ Stream<String> dataProvider() {
        return Stream.of("00-aa-00-62-c6-09", "01-00-5e-00-00-fb");
    }

    @ParameterizedTest
    @MethodSource
    @Tag("TEST_MAC")
    @DisplayName("Implicit method source")
    public void testValidMacAddressFromImplicitMethodSource(String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }

    public /*static*/ Stream<String> testValidMacAddressFromImplicitMethodSource() {
        return Stream.of("00-aa-00-62-c6-00", "01-00-5e-00-00-aa");
    }
}
