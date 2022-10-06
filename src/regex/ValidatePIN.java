package src.regex;

import java.util.regex.Pattern;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/sCP58J9vcexchgwo7">edabit</a><br>
 * Difficulty: Hard<br>
 * Tags: regex, strings, validation
 */
public class ValidatePIN
{
    public static boolean validate(String pin)
    {
        Pattern fourDigit = Pattern.compile("[0-9]{4}");
        Pattern sixDigit = Pattern.compile("[0-9]{6}");
        return (pin.matches(fourDigit.pattern()) || pin.matches(sixDigit.pattern()));
    }
}
