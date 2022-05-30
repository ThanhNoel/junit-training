package junit5;

public final class NumberUtils {
    private NumberUtils() {
        throw new IllegalStateException("Utility class can not be initialized");
    }

    // example -1 , 3
    public static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
    public static boolean isReallyOdd(int number) {
    	return isPrivatelyOdd(number);
    }
    private static boolean isPrivatelyOdd(int number) {
    	return (number & 1) == 1;
    }

    // example -2, 2
    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public static boolean isPositiveIntegerNumber(int number) {
        return number > 0;
    }

    public static double divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}
