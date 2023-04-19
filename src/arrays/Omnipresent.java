package src.arrays;

import java.util.Arrays;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5">edabit</a><br>
 * Difficulty: Medium <br>
 * Tags: arrays, algorithms, loops, validation
 */
public class Omnipresent {
    public static boolean omnipresent(int[][] arr, int val)
    {
        boolean isOmnipresent = false;
        for (int[] currentArray : arr)
        {
            isOmnipresent = Arrays.stream(currentArray).anyMatch(n -> n == val);
            if (!isOmnipresent)
            {
                break;
            }
        }
        return isOmnipresent;
    }
}
