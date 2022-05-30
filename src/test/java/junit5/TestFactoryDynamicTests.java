package junit5;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactoryDynamicTests {

    @TestFactory
    public Stream<DynamicTest> testDynamicTest() {

        DynamicTest first = DynamicTest.dynamicTest("first test", () -> {
        	System.out.println("first test running");
        	assertEquals(1, 1);
        });

        DynamicTest second = DynamicTest.dynamicTest("second test", () -> {
        	System.out.println("second test running");
        	assertEquals(2, 1);
        });

        int random = new Random().nextInt(2);

        System.out.println("Random value " + random);

        if (random == 0) {
            return Stream.of(first);
        }
        return Stream.of(first, second);
    }
}
