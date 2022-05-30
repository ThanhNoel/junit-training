package junit5;

import java.util.regex.Pattern;

public final class StringUtils {
    private StringUtils() {
        throw new IllegalStateException("Utility class can not be initialized");
    }

    public static boolean isValidMACAddress(String value) {
        if (value == null) {
            return false;
        }
        return Pattern.compile("^(?:[a-fA-F0-9]{2}[:-]){5}[a-fA-F0-9]{2}$").matcher(value).find();
    }
}
