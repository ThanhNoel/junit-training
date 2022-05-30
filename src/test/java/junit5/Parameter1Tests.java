package junit5;

import junit5.support.CustomArgumentProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.*;

import java.time.temporal.ChronoUnit;
import java.util.EnumSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Parameter1Tests {
    @ParameterizedTest(name = "Test number {0}")
    @ValueSource(ints = {-1, 1, 3, 5, 7, 9, 11})
    public void testOddNumber(int number) {
        boolean isOdd = NumberUtils.isOdd(number);
        assertTrue(isOdd);
    }

    @ParameterizedTest(name = "Test {0} :  {1}")
    @CsvSource({"VALID_MAC, 94-db-56-73-03-3c",
    	"INVALID_MAC,01-00-5e-7f-ff-fZ"})
    @Tag("TEST_MAC")
    public void testValidMacAddress(String name, String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }


    @DisplayName("use ArgumentsAccessor when we have multiple arguments")
    @ParameterizedTest(name = "Test {0} :  {1}")
    @CsvSource({"VALID_MAC,94-db-56-73-03-3c", "name INVALID_MAC,01-00-5e-7f-ff-fZ"})
    @Tag("TEST_MAC")
    public void testValidMacAddress(ArgumentsAccessor arguments) {
        String mac = arguments.getString(1);
        System.err.println(mac);
        boolean isValidMAC = StringUtils.isValidMACAddress(mac);
        assertTrue(isValidMAC);
    }


    @ParameterizedTest(name = "Test User {0} age {1}")
    @CsvFileSource(resources = "/user.csv", numLinesToSkip = 1)
    public void testValidAge(String name, int number) {
        boolean isValidAge = NumberUtils.isPositiveIntegerNumber(number);
        assertTrue(isValidAge);
    }


    @ParameterizedTest
    @EnumSource(names = {"DAYS", "HOURS"})
    void testWithEnumSourceInclude(ChronoUnit unit) {
        assertTrue(EnumSet.of(ChronoUnit.DAYS, ChronoUnit.HOURS).contains(unit));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    @Tag("TEST_MAC")
    @DisplayName("Explicit method source")
    public void testValidMacAddressFromExplicitMethodSource(String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }

    public static Stream<String> dataProvider() {
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

    public static Stream<String> testValidMacAddressFromImplicitMethodSource() {
        return Stream.of("00-aa-00-62-c6-00", "01-00-5e-00-00-aa");
    }


    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class) // same as method source but reused
    @DisplayName("Parameterized test with ArgumentSource")
    @Tag("TEST_MAC")
    public void testValidMacAddressFromArgumentSource(String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }


    @ParameterizedTest(name = "Test MAC {index} with value :{0}")
    @DisplayName("Parameterized test with combine multiple sources")
    @ValueSource(strings = {"d4-9a-a0-54-3a-10", "94-db-56-73-03-3c"})
    @NullAndEmptySource
    @CsvSource({"ff-ff-ff-ff-ff-ff", "01-00-5e-00-00-16"})
    @Tag("TEST_MAC")
    public void testValidMacAddressCombineSource(String value) {
        boolean isValidMAC = StringUtils.isValidMACAddress(value);
        assertTrue(isValidMAC);
    }


}
