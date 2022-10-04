package test.recursion;

import org.junit.Assert;
import org.junit.Test;

import static src.recursion.FibonacciNumber.Fibonacci;

/**
 * Unit tests for the src.recursion.FibonacciNumber class, examples taken from <a href="https://edabit.com/challenge/t3NThQjrcbjhiF5zt">edabit</a>
 */
public class FibonacciNumberTest {

    @Test
    public void fibonacciTest()
    {
        Assert.assertEquals(3, Fibonacci(3));
        Assert.assertEquals(21, Fibonacci(7));
        Assert.assertEquals(233, Fibonacci(12));
    }
}
