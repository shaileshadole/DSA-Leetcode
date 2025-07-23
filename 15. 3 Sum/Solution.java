import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int first = nums[i];
            HashMap <Integer, Integer> numToIdx = new HashMap<>();
            
            for(int j = i+1; j < nums.length; j++){
                int compliment = 0 - first - nums[j];

                if(numToIdx.containsKey(compliment)){
                    ans.add(Arrays.asList(nums[i], nums[j], compliment));
                }else{
                    numToIdx.put(nums[j], j);
                }
            }
        }

        System.out.println(ans);

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}