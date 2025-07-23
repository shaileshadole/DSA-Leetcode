import java.util.*;

public class Main {
    public static int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int val : nums) {
            currSum += val;
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
