import java.util.HashSet;

class Main {
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        // HashSet<Integer> hash = new HashSet<>();
        // int[] ans = new int[nums1.length];
        // int k = 0;

        // //Populate the hashSet
        // for(int i = 0; i < nums1.length; i++){
        //     hash.add(nums1[i]);
        // }

        // //Checking with the hashset
        // for(int i = 0; i < nums2.length; i++){

        //     if(hash.contains(nums2[i])){
        //         ans[k++] = nums2[i];
        //     }
        // }

        // int[] ans2 = new int[k];
        // for(int i = 0; i < k; i++){
        //     ans2[i] = ans[i];
        // }

        // System.out.println("\n\nPrinting the array");
        // for(int ch : ans2){
        //     System.out.println(ch + " ");
        // }

        // return ans2;



        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check nums2 elements in set1 and store unique results
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);  // Ensures uniqueness
            }
        }

        // Convert HashSet to array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("heellop");

        int[] nums1 = {4,9,5}; 
        int[] nums2 = {9,4,9,8,4};

        System.out.println(intersection(nums1, nums2));
    }
}