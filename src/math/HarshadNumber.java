package math;

public class HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =  (x % 1000 / 100) + ((x % 100) / 10) + (x % 10);
        return x % sum == 0 ? sum : -1;
    }
}
