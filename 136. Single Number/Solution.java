class Solution {
    public int singleNumber(int[] nums) {
        
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            result = result ^ nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int[] nums = {4,1,2,1,2, 5, 4};

        Solution s1 = new Solution();
        System.out.println(s1.singleNumber(nums));
    }
}