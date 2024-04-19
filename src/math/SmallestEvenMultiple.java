package math;

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;

        return n * 2;
    }
}
