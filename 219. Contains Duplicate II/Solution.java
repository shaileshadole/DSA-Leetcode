import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
           
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                if((i - hash.get(nums[i])) <= k){
                    return true;
                }

                hash.replace(nums[i], i);
            }else{
                hash.put(nums[i], i);
            }
        }

        
        return false;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        // int[] nums = {1,2,3,1};
        // int k = 3;

        Solution s1 = new Solution();
        System.out.println(s1.containsNearbyDuplicate(nums, k));
    }
}