package commons;

import org.junit.Assert;

public class VerifyTest {

    public static void verify(String expected, String actual){
        Assert.assertEquals(expected,actual);
    }
}

