import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void maximumNumberInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(40,60,100);
        Assert.assertEquals(100,maxNumInteger.intValue());
    }
}

