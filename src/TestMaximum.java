import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    //UC1- Test max.Value of 3 Integers
    @Test
    public void maximumNumberInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(40, 60, 100);
        Assert.assertEquals(100.00, 100, maxNumInteger.intValue());
    }
    //UC-2 Test max.Value of 3 Floats

    @Test
    public void maximumNumberFloat() {
        FindMaximum findMaximum = new FindMaximum();
        Float maxNumFloat = findMaximum.maxFloat(40.00f, 60.00f, 100.00f);
        Assert.assertEquals(100.00f, 100.00f, maxNumFloat.floatValue());
    }

    // UC3- testing maximum value of 3 Strings
    @Test
    public void maximumString() {
        FindMaximum max = new FindMaximum();
        String maxNumString = max.maxString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maxNumString);
    }
}


