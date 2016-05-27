import org.junit.Assert;
import org.junit.Test;

/**
 * Created by brprashant on 5/18/16.
 */
public class TestSampleString {


    SampleString sampleString = new SampleString();

    @Test
    public void testCompare(){
        Assert.assertTrue(sampleString.compareString("abcd", "aabbccdd"));
        Assert.assertTrue(sampleString.compareString("a", "a"));
        Assert.assertFalse(sampleString.compareString("a", ""));
        Assert.assertFalse(sampleString.compareString("", "a"));

    }

    @Test
    public void testFail() throws NullPointerException{
        sampleString.compareString("abcd",null);
    }
}
