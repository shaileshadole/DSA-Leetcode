public class Solution2{
    
    public static int bs(int[] nums, int start, int end, int target){
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    
    public static int solve(int[] nums, int target){
        
        int start = 0;
        int end = nums.length - 1;


        while(start <= end){
            int mid = start + (end - start)/2;

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
            if(nums[mid] <= nums[end]){
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
        
        return -1;  
    }
    
    public static void main(String[] args) {
        
        
        int[] nums = {7, 8, 1, 2, 3, 4, 6};
        System.out.println(solve(nums, 18)); 
    }
}