public class Main{
    public static int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int prefix = 1, suffix = 1;

        //Prefix
        ans[0] = 1;
        for(int i = 1; i<nums.length; i++){
            prefix = prefix * nums[i - 1];
            ans[i] = prefix;
        }


        //Suffix
        for(int i = nums.length - 2; i >= 0; i--){
            suffix = suffix * nums[i + 1];
            ans[i] = ans[i] * suffix;
        }

        System.out.println("\n\nArray After function");
        for(int ch : ans){
            System.out.print(ch + " ");
        }
        
        
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println("heloo");

        int[] nums = {1, 2, 3, 4};

        //Printing the array
        System.out.println("Array before function");
        for(int ch : nums){
            System.out.print(ch + " ");
        }

        int[] ans = productExceptSelf(nums);

        //Printing the array
        System.out.println("\n\nArray After function");
        for(int ch : ans){
            System.out.print(ch + " ");
        }
    }
}