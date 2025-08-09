class Solution {
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[0] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if(end == nums.length - 1){
            return nums[0];
        }

        return nums[end + 1];
    }
}