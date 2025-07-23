import java.util.ArrayList;
import java.util.List;

public class Main{
    
    public static List<String> f1(int[] nums){
        List<String> list = new ArrayList<>();
        int start = 0, end = -1;
        
        // Handle empty array case
        if (nums.length == 0){
            return list; 
        }    
        

        for (int i = 1; i < nums.length; i++) {
            // If numbers are not consecutive
            if (nums[i] != nums[i - 1] + 1) {
                end = i - 1;
                if (start == end) {
                    list.add(nums[start] + "");
                } else {
                    list.add(nums[start] + "->" + nums[end]);
                }
                start = i;
            }
        }

        // Handling the last range
        if (start == nums.length - 1) {
            list.add(nums[start] + "");
        } else {
            list.add(nums[start] + "->" + nums[nums.length - 1]);
        }

        return list;

    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Hllo");

        // int[] nums = {0, 2, 3, 4, 6, 8, 9};
        int[] nums = {1, 2, 4, 6, 7, 8, 9, 48};
        System.out.println(f1(nums));
    }
}