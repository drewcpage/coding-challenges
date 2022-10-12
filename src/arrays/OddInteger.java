package src.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/8SHAyg8kdX8y72S3z">edabit</a><br>
 * Difficulty: Hard <br>
 * Tags: arrays, bit operations, math, loops
 */
public class OddInteger
{
    public static int findOdd(int[] arr)
    {
        int oddNumber = 0;
        List<Integer> waste = new ArrayList<>();
        for(int i : arr)
        {
            if (!waste.contains(i) && (Arrays.stream(arr).filter(number -> number == i).count() % 2 != 0))
            {
                oddNumber = i;
            }
            waste.add(i);
        }
        return oddNumber;
    }
}
