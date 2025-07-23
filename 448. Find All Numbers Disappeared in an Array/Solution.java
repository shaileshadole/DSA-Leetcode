import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
            
        List<Integer> ans = new ArrayList<>();
        
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0){
        //         if(nums[nums[i] - 1] > 0){
        //             nums[nums[i] - 1] = (-1) * nums[nums[i] - 1];
        //         }
        //     }
        // }
        
                System.out.println("array");
                for(int ch : nums){
                    System.out.print(ch + " ");
                }
        
        for(int i =0; i < nums.length; i++){         
            int temp = nums[i];        
            if(nums[i] < 0){
                temp = nums[i] * (-1);
            }

            if(nums[temp - 1] < 0){
                continue;
            }

            nums[temp - 1] = nums[temp - 1] * (-1);
        }

        System.out.println("\n\n New array");
        for(int ch : nums){
            System.out.print(ch + " ");
        }

        //Filling the ans
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i + 1);
                System.out.println(i + 1);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        findDisappearedNumbers(nums);
    }
}