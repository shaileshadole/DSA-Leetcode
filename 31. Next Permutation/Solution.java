import java.util.Arrays;

public class Solution {
    
    public static void nextPermutation(int[] nums) {
        
        int l = nums.length;
        int x = l - 1;

        //Finding the breaking element
        for(int i = l - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                x = i; 
                break;
            }
        }

        //If the array in in decending order
        if(x == l -1){
            // return the acesding order
            Arrays.sort(nums);
            return;
        }


        //Finding the min element
        int min = x+1;
        for(int i = x+1; i < l; i++){
            if(nums[i] > nums[x] && nums[i] < nums[min]){
                min = i;
            }
        }

        //Swapping the elements
        int temp = nums[min];
        nums[min] = nums[x];
        nums[x] = temp;


        //Creating the new array
        int[] ax = new int[l - x - 1];
        int j = 0;
        for(int i = x + 1; i < l; i++){
            ax[j] = nums[i];
            j++;
        }

        System.out.println("\n\nNew Array");
        for(int ch : ax){
            System.out.print(ch + " ");
        }

        Arrays.sort(ax);

        //Creating the answer
        j=0;
        for(int i = x + 1; i < l; i++){
            nums[i] = ax[j];
            j++;
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        
        System.out.println("Original Array\n");
        for(int ch : nums){
            System.out.print(ch + " ");
        }

        nextPermutation(nums);

        System.out.println("\n\nAnswer Array\n");
        for(int ch : nums){
            System.out.print(ch + " ");
        }
    }
}