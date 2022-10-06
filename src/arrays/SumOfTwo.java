package src.arrays;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/KSX8nW7HdxLK2iFj5">edabit</a><br>
 * Difficulty: Easy <br>
 * Tags: arrays, numbers, validation
 */
public class SumOfTwo
{
    public static boolean sumOfTwo(int[] array1, int[] array2, int targetSum)
    {
        boolean sumToTarget = false;
        for(int numArray1 : array1)
        {
           for(int numArray2 : array2)
           {
               sumToTarget = (numArray1 + numArray2 == targetSum);
               if(sumToTarget) break;
           }
           if(sumToTarget) break;
        }
        return sumToTarget;
    }

}
