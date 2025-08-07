class Solution {

    public static boolean bs(int[] nums, int start, int end, int target){
        boolean ans = false;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = true;
                break;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    
    public boolean search(int[] nums, int target){
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // Trim duplicates from both sides
            while(start < mid && nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }

            //Left half is sorted
            if(nums[start] <= nums[mid]){
                //Target Present in left half 
                if(nums[start] <= target && target <= nums[mid]){
                    return bs(nums, start, mid, target);
                }
                //Not present in left half
                else{
                    start = mid + 1;
                }
            }

            //Right half is sorted
            else if(nums[mid] <= nums[end]){
                //Target present in the right half
                if(nums[mid] <= target && target <= nums[end]){
                    return bs(nums, mid, end, target);
                }
                //not present in the right half
                else {
                    end = mid - 1;
                }
            }
        }
        
        return false;  
    }
}