import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main{

    public static List<List<Integer>> threeSum(int[] nums) {
        
        HashMap<Integer, Integer> numToIdx = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            int fixed = nums[i];
            for(int j = i + 1; j < nums.length; j++){

                int compliment = 0 - fixed - nums[j];

                if(numToIdx.containsKey(compliment)){
                    ans.add(Arrays.asList(fixed, nums[j], compliment));
                }else{
                    numToIdx.put(nums[j], j);
                }
            }

        }

        return ans;

    }


    public static void main(String[] args) {
        System.out.println("hello");

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}