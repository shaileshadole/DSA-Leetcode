class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0){
            return 0;
        }

        int lastIndex = nums.length - 1;

        for(int i = 0; i < lastIndex; i++){
            if(nums[i] == val){
                while(nums[lastIndex] == val){
                    lastIndex--;

                    //lI i paryent phochla
                    if(lastIndex <= i){
                        return lastIndex;
                    }
                }
                nums[i] = nums[lastIndex];
                nums[lastIndex] = 2;
            }

            //printing the array
            System.out.println("\n\ni = " + i);
            for(int ch : nums){
                System.out.print(ch + " ");
            }
        }

        //Counting values at last to determine unique elements
        int returnV = nums.length - 1;
        while(nums[returnV] == val){
            returnV--;
        }
        
        
        return returnV + 1;
    }

    public static void main(String[] args) {
        // System.out.println("Hello");

        // int[] nums = {0,1,2,2,3,0,4,2};
        // int val = 2;

        int[] nums = { 2, 2, 2, 2};
        int val = 2;

        // int[] nums = {2};
        // int val = 2;

        // int[] nums = {2, 1, 3, 4, 2};
        // int val = 2;

        // int[] nums = {1, 2, 2, 3, 4};
        // int val = 2;


        Solution s1 = new Solution();
        System.out.println(s1.removeElement(nums, val));
    }

}

























// class Solution {
//     public int removeElement(int[] nums, int val) {
//         //Printing the array
//         System.out.println("\nInitial Array");
//         for( int i = 0; i < nums.length; i++ ){
//             System.out.print("["+ nums[i] +"] ");
//         }
//         System.out.println("\n");

//         int repeated = 0;
//         int k = 0;

//         //Replacing with 999
//         for (int i = 0; i < nums.length; i++) {
//             if (val == nums[i]) {
//                 nums[i]=999;
//                 repeated++;
//             }
//         }

//         //Printing the array
//         for( int i = 0; i < nums.length; i++ ){
//             System.out.print("["+ nums[i] +"] ");
//         }


//         //After Sorting
//         Arrays.sort(nums);
//         System.out.println("\n\nAfter sorting");
//         for( int i = 0; i < nums.length; i++ ){
//             System.out.print("["+ nums[i] +"] ");
//         }


//         int newLength = nums.length - repeated;
//         int[] newArray = new int[newLength];


//         //Creating New Array
//         for( int i = 0; i < newLength; i++){
//             newArray[i] = nums[i];
//         }

//         //modify nums array
//         for( int i = 0; i < newLength; i++){
//              nums[i] = newArray[i];
//              k++;
//         }


//         //Printing the array
//         System.out.println("\n\nFinal Array");
//         for( int i = 0; i < newArray.length; i++ ){
//             System.out.print("["+ newArray[i] +"] ");
//         }


//         return k;
//     }
// }