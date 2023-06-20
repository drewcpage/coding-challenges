package test.arrays;

import org.junit.Assert;
import org.junit.Test;

import static src.arrays.Omnipresent.omnipresent;

/**
 * Unit tests for the Omnipresent class, examples taken from <a href="https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5">edabit</a>
 * @see src.arrays.Omnipresent
 *
 */
public class OmnipresentTest
{
    @Test public void omnipresentTest()
    {
        Assert.assertTrue(omnipresent(new int[][]{{1, 1}, {1, 3}, {5, 1}, {6, 1}}, 1));
        Assert.assertFalse(omnipresent(new int[][]{{1, 1}, {1, 3}, {5, 1}, {6, 1}}, 6));
        Assert.assertTrue(omnipresent(new int[][]{{5}, {5}, {5}, {6, 5}}, 5));
        Assert.assertFalse(omnipresent(new int[][]{{5}, {5}, {5}, {6, 5}}, 6));
    }
}
