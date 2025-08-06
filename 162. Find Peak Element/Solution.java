class Solution {
    public int findPeakElement(int[] nums) {
        
        int start = 0;
        int end = nums.length - 2;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return end + 1;
    }
}