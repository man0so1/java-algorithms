package arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            res = Math.max((Math.min(height[right], height[left]) * (right - left)), res);
            if (height[right] > height[left]) left++;
            else right--;
        }

        return res;
    }

    private static int bruteForce(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > maxArea) { maxArea = area; }
            }
        }

        return maxArea;
    }
}
