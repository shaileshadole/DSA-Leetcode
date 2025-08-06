public class Solution {

    public static int[] binary(int nums[], int target){

        int start = 0; 
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }         
        }
        
        int start2 = 0;
        int end2 = nums.length - 1;
        
        while(start2 <= end2){
            int mid = start2 + (end2 - start2)/2;
            
            if(nums[mid] > target){
                end2 = mid - 1;
            }else{
                start2 = mid + 1;
            }         
        }

        // System.out.println("\n\nAnswer: [" + start + " , " + end2 + " ]");

        if(end2 > start){
            return new int[] {-1, -1};
        }
        return new int[] {start, end2};
        
    }
    public static void main(String[] args) {
        System.out.println("Hello");

        int nums[] = {0, 1, 3, 4, 4, 4, 4, 5, 16};
        binary(nums, 6);

    }
}
















// My Intital Soution

// public class Solution {

//     public static void binary(int nums[], int target){

//         int start = 0; 
//         int end = nums.length - 1;

//         while(start <= end){
//             int mid = start + (end - start)/2;

//             // System.out.println("Start: " + start + "  (" + nums[start]);
//             // System.out.println("End: " + end + "  (" + nums[end]);
//             // System.out.println("Mid: " + mid + "  (" + nums[mid]);
//             // System.out.println();

//             if(nums[mid] < target){
//                 start = mid + 1;
//             }else{
//                 end = mid - 1;
//             }         
//         }

//         System.out.println("Start1: " + start);
//         System.out.println("End1: " + end);
        
//         int start2 = 0;
//         int end2 = nums.length - 1;
        
//         while(start2 <= end2){
//             int mid = start2 + (end2 - start2)/2;
            
//             // System.out.println("Start: " + start + "  (" + nums[start]);
//             // System.out.println("End: " + end + "  (" + nums[end]);
//             // System.out.println("Mid: " + mid + "  (" + nums[mid]);
//             // System.out.println();
            
//             if(nums[mid] > target){
//                 end2 = mid - 1;
//             }else{
//                 start2 = mid + 1;
//             }         
//         }
        
//         System.out.println("Start2: " + start2);
//         System.out.println("End2: " + end2);

//         System.out.println("\n\nAnswer: [" + start + " , " + end2 + " ]");
        
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello");

//         int nums[] = {0, 1, 3, 4, 4, 4, 4, 5, 16};
//         binary(nums, 6);

//     }
// }
