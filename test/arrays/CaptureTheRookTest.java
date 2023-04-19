package test.arrays;

import org.junit.Assert;
import org.junit.Test;

import static src.arrays.CaptureTheRook.canCapture;

/**
 * Unit tests for the CaptureTheRook class, examples taken from <a href="https://edabit.com/challenge/rYD9NTBmNhaPM6wx2">edabit</a>
 * @see src.arrays.CaptureTheRook
 *
 */
public class CaptureTheRookTest {

    @Test public void canCaptureTest()
    {
        Assert.assertTrue(canCapture(new String[]{"A8", "E8"}));
        Assert.assertFalse(canCapture(new String[]{"A1", "B2"}));
        Assert.assertTrue(canCapture(new String[]{"H4", "H3"}));
        Assert.assertFalse(canCapture(new String[]{"F5", "C8"}));
    }
}
