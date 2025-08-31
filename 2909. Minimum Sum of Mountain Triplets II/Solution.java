class Solution {
    public int minimumSum(int[] nums) {
        
        int n = nums.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int ans = Integer.MAX_VALUE;


        //LeftMin
        leftMin[0] = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            leftMin[i] = Math.min(leftMin[i - 1], nums[i - 1]);
        }

        //rightMin
        rightMin[n - 1] = Integer.MAX_VALUE;
        for(int i = n - 2; i >= 0; i--){
            rightMin[i] = Math.min(rightMin[i+1], nums[i+1]);
        }

        //Middle element
        for(int i = 1; i < n - 1; i++){
            if(leftMin[i] < nums[i] && nums[i] > rightMin[i]){
                ans = Math.min(ans, (leftMin[i] + rightMin[i] + nums[i]));
            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}