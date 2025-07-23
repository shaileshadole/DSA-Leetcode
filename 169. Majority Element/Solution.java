
import java.util.Hashtable;

public class Solution{
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] nums = {2,2,1,1,1,2,2};

        int majority = nums[0], votes = 1;

        for(int i = 1; i < nums.length; i++){
            System.out.println("I = " + i);
            System.out.println("Majority : " + majority);
            System.out.println("Votes : " + votes);
            System.out.println();

            if(votes == 0){
                majority = nums[i];
                votes++;
            }else if(nums[i] == majority){
                votes++;
            }else{
                votes--;
            }
        }

        System.out.println("Majority : " + majority);
        System.out.println("Votes : " + votes);

    }   
}