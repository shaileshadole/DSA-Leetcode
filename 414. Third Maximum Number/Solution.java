class Solution {
    public static int thirdMax(int[] nums) {
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; 
        int third = Integer.MIN_VALUE; 

        //Biggest
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                first = nums[i];
            }
        }

        //Second Biggest
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == first){
                continue;
            }
            if(nums[i] > second){
                second = nums[i];
            }
        }

        //Third Biggest
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == first || nums[i] == second){
                continue;
            }
            if(nums[i] > third){
                third = nums[i];
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        if(third == Integer.MIN_VALUE){
            return first;
        }
        
        return third;
        
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        // int[] nums = {3,2,1};
        // int[] nums = {2,2,3,1};
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }
}