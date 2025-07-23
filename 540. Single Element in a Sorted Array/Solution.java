class Solution {
    public static int singleNonDuplicate(int[] nums) {
        
        int start = 0, end = nums.length - 1;

        while(start <= end){

            
            int mid = (start + end) / 2;
            System.out.println("Start = " + start + " End = " + end + " Mid = " + mid);
            
            if(nums[mid] == nums[mid + 1]){
                start = mid + 1;
            }

            if(nums[mid] == nums[mid - 1]){
                end = mid;
            }

            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
        }
        
        
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println("hello");

        int[] nums = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleNonDuplicate(nums));

    }
}