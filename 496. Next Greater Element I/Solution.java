class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        int flag = 0;

        for(int i = 0; i < nums1.length; i++){
            int big = -1;
            for(int j = 0; j < nums2.length; j++){  
                if(flag == 1 && nums2[j] > nums1[i]){
                    big = nums2[j];
                    break;
                }
                
                if(nums2[j] == nums1[i]){
                    flag = 1;
                }


            }
            ans[i] = big;
            flag = 0;
        }

        System.out.println("This is the answer array");
        for(int ch : ans){
            System.out.print(ch + " ");
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2}; 
        int[] nums2 = {1,3,4,2};
        nextGreaterElement(nums1, nums2);
    }
}