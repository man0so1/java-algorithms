package arrays;

import java.util.Arrays;

public class NumberOfLaserBeamsInBank {
    public static int numberOfBeams(String[] bank) {
        int[] prepare = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            prepare[i] = bank[i].split("1", -1).length-1;
        }

        int lastValidIndex = 0; int result = 0; boolean firstMeet = true;
        for (int i = 0; i < prepare.length; i++) {
            if (prepare[i] == 0) continue;

            if (prepare[i] != 0 && !firstMeet) {
                result += prepare[lastValidIndex] * prepare[i];
                lastValidIndex = i;
            } else if (prepare[i] != 0 && firstMeet) {
                lastValidIndex = i;
                firstMeet = false;
            }
        }

        return result;
    }
}
