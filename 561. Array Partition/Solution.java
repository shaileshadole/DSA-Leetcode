class Solution {
    public int arrayPairSum(int[] nums) {
        int array[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(array);
        int ans = 0;

        for(int i = 0; i < array.length; i++){
            ans += Math.min(array[i], array[i+1]);
            i++;
        }

        return ans;
    }
}