package src.arrays;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/rYD9NTBmNhaPM6wx2">edabit</a><br>
 * Difficulty: Medium <br>
 * Tags: arrays, conditions, games, validation
 */
public class CaptureTheRook {
    public static boolean canCapture(String[] rooks)
    {
        final char[] rookSplit1 = rooks[0].toCharArray();
        final char[] rookSplit2 = rooks[1].toCharArray();

        return (rookSplit1[0]==(rookSplit2[0]) || rookSplit1[1]==(rookSplit2[1]));
    }
}
