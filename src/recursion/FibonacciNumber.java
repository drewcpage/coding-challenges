package src.recursion;

/**
 * Challenge taken from <a href="https://edabit.com/challenge/t3NThQjrcbjhiF5zt">edabit</a><br>
 * Difficulty: Medium<br>
 * Tags: algebra, algorithms, loops, recursion
 */
public class FibonacciNumber
{
    public static int Fibonacci(int a) {
        if (a == 0) {
            return 1;
        } else if (a <= 1) {
            return a;
        } else {
            return Fibonacci(a - 1) + Fibonacci(a - 2);
        }
    }
}
