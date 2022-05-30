package junit4;

import junit5.StringUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit4.api.category.TestMac;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parameter2Tests {

    private String name;

    private String mac; // can use private modifier

    public Parameter2Tests(String name, String mac) {
        this.name = name;
        this.mac = mac;
    }


    @Category(value = TestMac.class)
    @Parameters(name = "Test {0} :  {1}")
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {"VALID_MAC", "94-db-56-73-03-3c"},
                {"INVALID_MAC", "01-00-5e-7f-ff-fZ"}
        });
    }


    @Test
    public void testValidMacAddress() {
        boolean isValidMAC = StringUtils.isValidMACAddress(mac);
        assertTrue(isValidMAC);
    }
}
