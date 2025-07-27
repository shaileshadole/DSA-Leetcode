class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        // for(int i = 0; i < nums.length - 2; i++){
        //     if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2]){
        //         return true;
        //     }
        // }
        // return false;

        int min1 = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;

        min1 = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] > min1){
                min2 = nums[i];
            }else if(nums[i] > min2){
                return true;
            }else if(nums[i] < min2){

            }
        }

        // for(int i = 0; i < nums.length; i++){

        //     if(nums[i] < min1){
        //         min1 = nums[i];
        //     }
        //     if(nums[i] < min2){
        //         min2 = nums[i];
        //     }
        // }

    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};

        Solution s1 = new Solution();
        System.out.println(s1.increasingTriplet(nums));
    }
}

