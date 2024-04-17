package arrays;

public class FindTheOriginalArrayPrefixXor {
    public static int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }

    /**
     * Решение не прошло 43 из 46 тест по времени D:
     *
     * @param pref массивчик
     * @return тож массивчик
     */
    private static int[] findArrayFirstAttempt(int[] pref) {
        int[] res = new int[pref.length];

        for (int i = 0; i < pref.length; i++) {
            if (i == 0) { res[0] = pref[0]; continue; }

            int num = res[0];
            for (int j = 1; j <= i; j++) {
                num = num ^ res[j];
            }

            res[i] = num ^ pref[i];
        }

        return res;
    }
}
