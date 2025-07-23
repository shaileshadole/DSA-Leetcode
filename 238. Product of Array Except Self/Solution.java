class Solution{
    
    public static int[] productExceptSelf(int[] nums){
        
        int[] ans = new int[nums.length];
        int total = nums[0], count = 0, idx = -1;

        //Finding the product
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                idx = i;
                continue;
            }            
            total = total * nums[i];
        }

        // System.out.println("Count = " + count);
        // System.out.println("Index = " + idx);
        // System.out.println("Total = " + total);


        if(count == 1){
            for(int i = 0; i < nums.length; i++){
                if(i == idx){
                    ans[i] = total;
                    continue;
                }
                ans[i] = 0;
            }
        }else if(count == 0){
            for(int i = 0; i < nums.length; i++){         
                ans[i] = total / nums[i];
            }
        }else if(count > 1){
            for(int i = 0; i < nums.length; i++){         
                ans[i] = 0;
            }
        }
        
        
        return ans;
    }
    
    public static void main(String[] args) {
       
        //  int[] nums = {1, 2, 3, 4};
        //  int[] nums = {-1, 1, 0, -3, 3, 0};
         int[] nums = {0, 2, 3, 4};
         int[] ans = productExceptSelf(nums);

         for(int ch : ans){
            System.out.print(ch + " ");
         }
    }
}