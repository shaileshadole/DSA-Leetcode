class Solution {
    public int removeDuplicates(int[] nums) {

        int uniqueIndex = 0;

        for(int i = 1; i < nums.length; i++){

            if(nums[uniqueIndex] != nums[i]){
                uniqueIndex++;

                nums[uniqueIndex] = nums[i];
            }
        }


        return uniqueIndex + 1;

    }

    public static void main(String[] args) {
        
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // int[] nums = {0, 1, 2, 3, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9};

        // int[] nums = {1,1,2};

        Solution s1 = new Solution();

        System.out.println(s1.removeDuplicates(nums));
    }
}


























// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int count = 0;
//         int temp = 0;
        
//         for(int i = 0; i < nums.length - 1 - count; i++){
//             if(nums[i] == nums[i+1]){
//                 //Shifting all elements
//                 for(int k = i + 1; k < nums.length - count - 1; k++){
//                     temp = nums[k];
//                     nums[k] = nums[k+1];
//                     nums[k+1] = temp; 
//                 }
//                 i--;
//                 count++;
//             }
//         }
//         return nums.length - count;
//     }

//     public static void main(String[] args) {
        
//         int[] nums = {0,0,1,1,1,2,2,3,3,4};
//         // int[] nums = {0, 1, 2, 3, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9};

//         // int[] nums = {1,1,2};

//         Solution s1 = new Solution();

//         System.out.println(s1.removeDuplicates(nums));
//     }
// }