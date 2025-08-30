class Solution {
    public int minimumSum(int[] nums) {

        int n = nums.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int ans = Integer.MAX_VALUE;

        //Left min
        leftMin[0] = nums[0];
        System.out.println(leftMin[0]);
        for(int i = 1; i < nums.length; i++){
            leftMin[i] = Math.min(leftMin[i-1], nums[i]);
            System.out.println(leftMin[i]);
        }

        //right Min
        rightMin[n - 1] = nums[n - 1];
        System.out.println();
        System.out.println(rightMin[n - 1]);
        for(int i = n - 2; i >= 0; i--){
            rightMin[i] = Math.min(rightMin[i+1], nums[i]);
            System.out.println(rightMin[i]);
        }

        //middle Element
        for(int i = 1; i < n - 1; i++){
            if(leftMin[i - 1] < nums[i] && nums[i] > rightMin[i+ 1]){
                ans = Math.min(ans, leftMin[i - 1] + rightMin[i + 1] + nums[i]);
            }
        }


        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}