package arrays;


public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int nestedSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                nestedSum += accounts[i][j];
            }
            if (i == 0) max = nestedSum;
            else {
                if (max < nestedSum) max = nestedSum;
            }
        }
        return max;
    }
}
