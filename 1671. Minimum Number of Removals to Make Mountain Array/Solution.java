class Solution {
    public static int minimumMountainRemovals(int[] nums) {
        
        int max = nums[0], maxIndex = 0, count = 0;

        //Find the peak
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }            
        }


        //Go to right
        for(int i = maxIndex; i < nums.length - 1; i++){
            if(!(nums[i] > nums[i+1])){
                count++;
                System.out.println("Number is " + nums[i+1] + " at index " + (i+1));
                
            }
        }
        
        //Go to left
        for(int i = maxIndex; i > 0; i--){
            if(!(nums[i - 1] < nums[i])){
                System.out.println("Number is " + nums[i-1] + " at index " + (i-1));
                count++;
            }
        }
     
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {2,1,1,5,6,2,3,1};
        System.out.println(minimumMountainRemovals(nums));
    }


}