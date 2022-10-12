package test.arrays;

import org.junit.Assert;
import org.junit.Test;

import static src.arrays.OddInteger.findOdd;

/**
 * Unit tests for the OddInteger class, examples taken from <a href="https://edabit.com/challenge/8SHAyg8kdX8y72S3z">edabit</a>
 * @see src.arrays.OddInteger
 *
 */
public class OddIntegerTest {

    @Test
    public void sumOfTwoTest()
    {
        Assert.assertEquals(findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}), -1);
        Assert.assertEquals(findOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}), 5);
        Assert.assertEquals(findOdd(new int[]{10}), 10);

    }
}
