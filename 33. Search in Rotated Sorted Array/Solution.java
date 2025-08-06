class Solution {
    
    public int peak(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] < nums[0]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        //always returns peak
        return end;
    }

    public int bs(int[] nums, int start, int end, int target){
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                break;
            }
        }

        return ans;
    }
    
    public int search(int[] nums, int target) {
        
        int peak = peak(nums);

        if(target == nums[peak]){
            return peak;
        }


        int ans = bs(nums, 0, peak, target);
        if(ans != -1){
            return ans;
        }

        return bs(nums, peak + 1, nums.length - 1, target);
    }
}