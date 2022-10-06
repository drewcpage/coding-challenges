package test.regex;

import org.junit.Assert;
import org.junit.Test;
import src.regex.ValidatePIN;

/**
 * Unit tests for the ValidatePIN class, examples taken from <a href="https://edabit.com/challenge/sCP58J9vcexchgwo7">edabit</a>
 * @see src.regex.ValidatePIN
 *
 */
public class ValidatePINTest
{
    @Test
    public void validatePINTest()
    {
        Assert.assertTrue(ValidatePIN.validate("121317"));
        Assert.assertTrue(ValidatePIN.validate("1234"));
        Assert.assertTrue(ValidatePIN.validate("900876"));
        Assert.assertFalse(ValidatePIN.validate("89abc1"));
        Assert.assertFalse(ValidatePIN.validate("45135"));
        Assert.assertFalse(ValidatePIN.validate(" 4983"));

    }

}
