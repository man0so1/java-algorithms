package arrays;

public class NumberEmployeesWhoMetTheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int worker = 0;
        for (int hour : hours) {
            if (hour >= target) worker++;
        }

        return worker;
    }
}
