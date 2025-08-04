class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;  // Handle cases where k > n

        if (k == 0) return;  // No rotation needed

        int[] arr = new int[k];

        //Copying future first part
        int j = 0;
        for(int i = nums.length - k; i < nums.length; i++){
            arr[j] = nums[i];
            j++;
        } 

        //Slinding the second half
        for(int i = nums.length - 1; i >= k; i--){
            nums[i] = nums[i-k];
        }

        //Populating the first part
        for(int i = 0; i < arr.length; i++){
            nums[i] = arr[i];
        }
    }
}