class Solution {
    public int diff(int num1, int num2){
        if(num1 > num2){
            return num1 - num2;
        }

        return num2 - num1;
    }
    
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;
            
            while(k > j){
                int sum  = nums[i] + nums[j] + nums[k];

                if(sum > target){
                    k--;
                }else if(sum < target){
                    j++;
                }else{
                    return target;
                }

                if(diff(target, ans) > diff(target, sum)){
                    ans = sum;
                }
            }
        }

        return ans;
    }
}