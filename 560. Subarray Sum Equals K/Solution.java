import java.util.HashMap;

class Solution {
    public static int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> prefixSumToFreq = new HashMap<>();
        prefixSumToFreq.put(0, 1); // To handle cases where subarray starts from index 0

        int count = 0;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            // Check if (sum - k) exists in the map
            if (prefixSumToFreq.containsKey(sum - k)) {
                count += prefixSumToFreq.get(sum - k); // Add frequency to count
            }

            // Update the frequency of the current prefix sum
            prefixSumToFreq.put(sum, prefixSumToFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("hello");

        int[] array = {1, 2, 3, 4, 7};

        subarraySum(array, 9);
    }
}