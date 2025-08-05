class Solution {
    public int maxProduct(int[] nums) {

        int leftSum = 1;
        int rightSum  = 1;
        int n = nums.length;
        int max = nums[0];

        for(int i = 0; i < n; i++){
            if(leftSum == 0){
                leftSum = 1;
            }

            if(rightSum == 0){
                rightSum = 1;
            }

            leftSum *= nums[i];
            rightSum *= nums[n - i - 1];

            max = Math.max(max, Math.max(leftSum, rightSum));
        }

        return max;

    }
}