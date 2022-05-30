package junit4;

import junit5.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit4.api.category.TestMac;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parameter1Tests {
    @Parameter
    public String name;

    @Parameter(value = 1)
    public String mac;


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
        Assert.assertTrue(isValidMAC);
    }
}
