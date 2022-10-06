package test.arrays;

import org.junit.Assert;
import org.junit.Test;

import static src.arrays.SumOfTwo.sumOfTwo;

/**
 * Unit tests for the SumOfTwo class, examples taken from <a href="https://edabit.com/challenge/KSX8nW7HdxLK2iFj5">edabit</a>
 * @see src.arrays.SumOfTwo
 *
 */
public class SumOfTwoTest {

    @Test
    public void sumOfTwoTest()
    {
        Assert.assertTrue(sumOfTwo(new int[]{1, 2}, new int[]{4, 5, 6}, 5));
        Assert.assertTrue(sumOfTwo(new int[]{1, 2}, new int[]{4, 5, 6}, 8));
        Assert.assertFalse(sumOfTwo(new int[]{1, 2}, new int[]{4, 5, 6}, 3));
        Assert.assertFalse(sumOfTwo(new int[]{1, 2}, new int[]{4, 5, 6}, 9));
    }
}
