import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numToIdx = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(numToIdx.containsKey(compliment)){
                return new int[] {numToIdx.get(compliment), i}
                
            }else{
                numToIdx.put(nums[i], i);
            }
        }
        
        //Nothing found  
        return new int[] {};
    } 
    
    
    public static void main(String[] args) {
        System.out.println();

        int[] nums = {2,7,11,15};
        int target = 9;

        // int[] nums = {3,3};
        // int target = 6;

        System.out.println(twoSum(nums, target));
    }
}    